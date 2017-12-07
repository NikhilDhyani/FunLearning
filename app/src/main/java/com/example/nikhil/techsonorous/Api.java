package com.example.nikhil.techsonorous;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NIKHIL on 07-12-2017.
 */

public interface Api {

    String BaseUrl  = "Enter your base url";



    @GET("posts")
    Call<List<PostList>> getPosts();
}
