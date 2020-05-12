package com.gzeinnumer.trainingdaggerpandec.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//todo 19
public interface ApiService {

    //https://jsonplaceholder.typicode.com/posts?userId=1
    @GET("posts")
    Call<List<ResponsePost>> getPost(
            @Query("userId") int id
    );
}
