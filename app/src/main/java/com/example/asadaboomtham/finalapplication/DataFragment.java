package com.example.asadaboomtham.finalapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DataFragment extends Fragment {

    RecyclerView myRecyclerView;
    LinearLayoutManager layoutManager;

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_data, container, false);

        myRecyclerView = (RecyclerView) layout.findViewById(R.id.my_recycler_view);
        myRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        myRecyclerView.setLayoutManager(layoutManager);

        getDataService();

        return layout;
    }

    private void getDataService() {
        Call<MovieItemCollectionDao> call = HttpManager.getInstance().getService().getMovie();
        call.enqueue(new Callback<MovieItemCollectionDao>() {
            @Override
            public void onResponse(Call<MovieItemCollectionDao> call, Response<MovieItemCollectionDao> response) {
                if (response.isSuccessful()) {
                    MovieItemCollectionDao movieItemCollectionDao = response.body();
                    Adapter adapter = new Adapter(movieItemCollectionDao);
                    myRecyclerView.setAdapter(adapter);
                } else {

                }
            }

            @Override
            public void onFailure(Call<MovieItemCollectionDao> call, Throwable t) {

            }
        });
    }


}
