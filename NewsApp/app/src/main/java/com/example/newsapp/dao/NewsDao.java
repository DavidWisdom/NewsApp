package com.example.newsapp.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.newsapp.entity.News;

import java.util.List;

@Dao
public interface NewsDao {
    @Insert
    void insertNews(News... news);

    @Delete
    void deleteNews(News... news);

    @Update
    void updateNews(News... news);

    @Query("SELECT * FROM News")
    List<News> getAllNews();
}
