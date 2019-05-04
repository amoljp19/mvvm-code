package com.softaai.mvvmcode.di.Component;

import com.softaai.mvvmcode.di.module.ArticleDetailActivityModule;
import com.softaai.mvvmcode.di.module.MainListActivityModule;
import com.softaai.mvvmcode.di.module.NetworkModule;
import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.remote.ApiResponseManager;
import com.softaai.mvvmcode.view.ArticleDetailActivity;
import com.softaai.mvvmcode.view.MainListAcivity;
import com.softaai.mvvmcode.viewmodel.ArticleDetailViewModel;
import com.softaai.mvvmcode.viewmodel.MainListViewModel;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Amol Pawar on 04-05-2019.
 * softAai Apps
 */

@Component(modules = {ArticleDetailActivityModule.class, MainListActivityModule.class, NetworkModule.class})
@Singleton
public interface AppComponent {

    void inject(MainListAcivity mainActivity);
    void inject(ArticleDetailActivity articleDetailActivity);
    void inject(ApiResponseManager apiResponseManager);

}
