package com.softaai.mvvmcode.di.module;

import androidx.transition.Visibility;

import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.viewmodel.ArticleDetailViewModel;
import com.softaai.mvvmcode.viewmodel.ArticleItemViewModel;
import com.softaai.mvvmcode.viewmodel.MainListViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amol Pawar on 04-05-2019.
 * softAai Apps
 */

@Module
public class ArticleDetailActivityModule {

    Results results;

    public ArticleDetailActivityModule(Results results){
        this.results = results;
    }

    @Provides
    @Singleton
    ArticleDetailViewModel provideArticleDetailViewModel(){
        return new ArticleDetailViewModel(results);
    }

}
