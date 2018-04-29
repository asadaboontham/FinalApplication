package com.example.asadaboomtham.finalapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by asada boomtham on 29/4/2561.
 */

public class Holder extends RecyclerView.ViewHolder {

    ImageView movieImageView;
    TextView movieTopic;

    public Holder(View itemView) {
        super(itemView);
        movieImageView = itemView.findViewById(R.id.movie_image_view);
        movieTopic = itemView.findViewById(R.id.movie_topic);
    }
}
