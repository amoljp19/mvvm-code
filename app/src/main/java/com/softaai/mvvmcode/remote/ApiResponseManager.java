package com.softaai.mvvmcode.remote;

import com.softaai.mvvmcode.model.ApiResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.softaai.mvvmcode.remote.ApiResponseClient.getClient;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ApiResponseManager {

    private final Retrofit client;
    private final String apiKey = "0fFXSxFu3GYAZIMTd6bPJaXZs2QNAcRp";

    public ApiResponseManager() {
        client = getClient();
    }


    public void getArticles(String period,final ApiCallback<ApiResponse> callback) {
        ArticleApi services = client.create(ArticleApi.class);
        services.getAllArticles(period, apiKey).enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                if (response.isSuccessful()) {
                    callback.success(response.body());
                } else {
                    callback.failure(response.code());
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                callback.failure(500);
            }
        });
    }


    public interface ApiCallback<T> {
        void success(T response);
        void failure(int responseCode);
    }
}
