package com.softaai.mvvmcode.remote;

import com.softaai.mvvmcode.model.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public interface ArticleApi {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/{period}.json?}")
    Call<ArticleResponse> getAllArticles(@Path("period") String period, @Query(value = "api-key", encoded = true) String apiKey);
}
