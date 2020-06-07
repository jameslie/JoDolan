package com.example.jodolan.view.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.jodolan.model.ArticlesItem;
import com.example.jodolan.model.NewsResponse;
import com.example.jodolan.service.ApiMain;
import com.example.jodolan.service.NewsRepository;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsViewModel extends ViewModel {
    private ApiMain apiMain;

    private MutableLiveData<ArrayList<ArticlesItem>> listMutableLiveData = new MutableLiveData<>();

    public void setListMutableLiveData(){
        if (this.apiMain == null){
            apiMain = new ApiMain();
        }
        apiMain.getApiNews().getDiscoverNews().enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                NewsResponse newsResponse = response.body();
                if (newsResponse != null && newsResponse.getArticles() != null){
                    ArrayList<ArticlesItem> articlesItems = newsResponse.getArticles();
                    listMutableLiveData.postValue(articlesItems);
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {

            }
        });
    }
    public LiveData<ArrayList<ArticlesItem>> getNews(){
        return listMutableLiveData;
    }
}
