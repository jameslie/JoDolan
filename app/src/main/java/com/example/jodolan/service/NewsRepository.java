package com.example.jodolan.service;

import com.example.jodolan.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsRepository {
    @GET("/v2/top-headlines?country=id&apiKey=5ff12e5a8f644dc3b0145f938a9dc34a")
    Call<NewsResponse> getDiscoverNews();
}
