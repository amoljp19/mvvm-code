package com.softaai.mvvmcode.remote;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ApiResponseClient {
    private static Retrofit retrofit = null;
    private static final String url = "http://api.nytimes.com/";

    public static Retrofit getClient() {
        OkHttpClient client;
        if (retrofit == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();

                    Request request = original.newBuilder()
                            .header("Content-Type", "application/json")
                            .header("Accept", "application/json")
                            .method(original.method(), original.body())
                            .build();


                    return chain.proceed(request);
                }
            });

            client = httpClient.build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .client(client)
                    .build();
        }

        return retrofit;
    }
}
