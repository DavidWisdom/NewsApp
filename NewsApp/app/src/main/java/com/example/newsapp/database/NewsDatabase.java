package com.example.newsapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.newsapp.dao.NewsDao;
import com.example.newsapp.entity.News;
import com.example.newsapp.entity.User;

@Database(entities = {News.class, User.class}, version = 1, exportSchema = false)
public abstract class NewsDatabase extends RoomDatabase {
    public abstract NewsDao getNewsDao();
}
