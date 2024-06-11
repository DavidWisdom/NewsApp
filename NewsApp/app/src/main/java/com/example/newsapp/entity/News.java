package com.example.newsapp.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey; // 导入PrimaryKey注解

import java.io.Serializable;

@Entity
public class News implements Serializable { // 实现Serializable接口，如果需要序列化对象
    private String title;
    private String content;
    private long publishedTimestamp; // 发布时间戳
    private long lastEditedTimestamp; // 最新编辑时间戳

    @PrimaryKey(autoGenerate = true) // 主键自动增长
    private int id;

    public News(String title, String content, long publishedTimestamp, long lastEditedTimestamp) {
        this.title = title;
        this.content = content;
        this.publishedTimestamp = publishedTimestamp;
        this.lastEditedTimestamp = lastEditedTimestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPublishedTimestamp() {
        return publishedTimestamp;
    }

    public void setPublishedTimestamp(long publishedTimestamp) {
        this.publishedTimestamp = publishedTimestamp;
    }

    public long getLastEditedTimestamp() {
        return lastEditedTimestamp;
    }

    public void setLastEditedTimestamp(long lastEditedTimestamp) {
        this.lastEditedTimestamp = lastEditedTimestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}