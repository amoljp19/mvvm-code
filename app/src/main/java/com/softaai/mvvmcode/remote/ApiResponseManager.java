package com.softaai.mvvmcode.remote;

import com.softaai.mvvmcode.di.MvvmCodeApp;
import com.softaai.mvvmcode.model.ArticleResponse;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ApiResponseManager {
    @Inject
    public Retrofit client;
    private final String apiKey = "0fFXSxFu3GYAZIMTd6bPJaXZs2QNAcRp";

    public ApiResponseManager() {
       // client = getClient();
        MvvmCodeApp.getComponent().inject(this);
    }


    public void getArticles(String period,final ApiCallback<ArticleResponse> callback) {
        ArticleApi services = client.create(ArticleApi.class);
        services.getAllArticles(period, apiKey).enqueue(new Callback<ArticleResponse>() {
            @Override
            public void onResponse(Call<ArticleResponse> call, Response<ArticleResponse> response) {
                if (response.isSuccessful()) {
                    callback.success(response.body());
                } else {
                    callback.failure(response.code());
                }
            }

            @Override
            public void onFailure(Call<ArticleResponse> call, Throwable t) {
                callback.failure(500);
            }
        });
    }


    public interface ApiCallback<T> {
        void success(T response);
        void failure(int responseCode);
    }
}
