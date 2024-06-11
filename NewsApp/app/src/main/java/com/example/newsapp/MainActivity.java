package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.example.newsapp.dao.NewsDao;
import com.example.newsapp.database.NewsDatabase;
import com.example.newsapp.entity.News;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    NewsDatabase newsDatabase;
    NewsDao newsDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsDatabase = Room.databaseBuilder(this, NewsDatabase.class, "news_database").allowMainThreadQueries().build();
        newsDao = newsDatabase.getNewsDao();
        init();
        query();
    }

    void init() {
        News news1 = new News("News Title 1", "Content of news 1", new Date().getTime(), new Date().getTime());
        News news2 = new News("News Title 2", "Content of news 2", new Date().getTime(), new Date().getTime());
        newsDao.insertNews(news1, news2);
    }

    void query() {
        List<News> list = newsDao.getAllNews();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            News news = list.get(i);
            text.append(news.getId()).append(" ").append(news.getTitle()).append(" ").append(news.getContent()).append(" ").append(news.getPublishedTimestamp()).append(" ").append(news.getLastEditedTimestamp()).append("\n");
        }
        Log.i("tag", text.toString());
    }

}