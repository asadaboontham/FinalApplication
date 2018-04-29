package com.example.asadaboomtham.finalapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asada boomtham on 29/4/2561.
 */

class MovieDao {

    @SerializedName("title")
    String title;

    @SerializedName("thumbnail")
    String thumbNail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbNail() {
        return thumbNail;
    }

    public void setThumbNail(String thumbNail) {
        this.thumbNail = thumbNail;
    }
}
