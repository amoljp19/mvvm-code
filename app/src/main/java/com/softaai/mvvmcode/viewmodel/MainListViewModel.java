package com.softaai.mvvmcode.viewmodel;

import android.app.Application;
import android.content.Context;
import android.view.View;

import com.softaai.mvvmcode.model.ArticleResponse;
import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.remote.ApiResponseManager;

import java.util.List;

import androidx.databinding.ObservableInt;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class MainListViewModel extends ViewModel {

    public ObservableInt articleProgress;
    public ObservableInt articleRecycler;

    private MutableLiveData<List<Results>> articleList;
    private Context context;
    ApiResponseManager apiResponseManager;

    public MainListViewModel(){
        articleProgress = new ObservableInt(View.VISIBLE);
        articleRecycler = new ObservableInt(View.VISIBLE);
        articleList = getArticles();
    }


    public MutableLiveData<List<Results>> getArticles() {
        if (articleList == null) {
            articleList = new MutableLiveData<List<Results>>();
            apiResponseManager = new ApiResponseManager();
            apiResponseManager.getArticles("7", new ApiResponseManager.ApiCallback<ArticleResponse>() {
                @Override
                public void success(ArticleResponse response) {
                    articleProgress.set(View.GONE);
                    articleRecycler.set(View.VISIBLE);
                    articleList.setValue(response.getResults());
                }

                @Override
                public void failure(int responseCode) {
                    articleProgress.set(View.GONE);
                    articleRecycler.set(View.VISIBLE);
                }
            });
        }

        return articleList;
    }


}
