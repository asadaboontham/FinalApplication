package com.example.asadaboomtham.finalapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

/**
 * Created by asada boomtham on 29/4/2561.
 */

public class Adapter extends RecyclerView.Adapter<Holder> {

    MovieItemCollectionDao movieItemCollectionDao;

    public Adapter(MovieItemCollectionDao movieItemCollectionDao) {
        this.movieItemCollectionDao = movieItemCollectionDao;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        Holder recyclerViewHolder = new Holder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Picasso.get()
                .load(movieItemCollectionDao.getPosts().get(position).getThumbNail())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(holder.movieImageView);
        holder.movieTopic.setText(movieItemCollectionDao.getPosts().get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        if(movieItemCollectionDao != null)
        return movieItemCollectionDao.getPosts().size();

        return  0;
    }
}
