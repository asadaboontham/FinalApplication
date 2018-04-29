package com.example.asadaboomtham.finalapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by asada boomtham on 29/4/2561.
 */

class MovieItemCollectionDao {

    @SerializedName("status")
    String status;

    @SerializedName("posts")
    List<MovieDao> posts;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<MovieDao> getPosts() {
        return posts;
    }

    public void setPosts(List<MovieDao> posts) {
        this.posts = posts;
    }
}
