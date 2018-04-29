package com.example.asadaboomtham.finalapplication;



import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("get_posts?include=id%2Ctitle%2Cthumbnail")
    Call<MovieItemCollectionDao> getMovie();


}
