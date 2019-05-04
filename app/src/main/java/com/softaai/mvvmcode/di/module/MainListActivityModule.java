package com.softaai.mvvmcode.di.module;

import androidx.annotation.NonNull;

import com.softaai.mvvmcode.adapter.ArticleItemAdapter;
import com.softaai.mvvmcode.viewmodel.MainListViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amol Pawar on 04-05-2019.
 * softAai Apps
 */

@Module
public class MainListActivityModule {

    @Provides
    @NonNull
    @Singleton
    public MainListViewModel provideMainListViewModel(){
        return new MainListViewModel();
    }


    @Provides
    @NonNull
    @Singleton
    public ArticleItemAdapter provideArticleItemAdapter(){
        return new ArticleItemAdapter();
    }


}

