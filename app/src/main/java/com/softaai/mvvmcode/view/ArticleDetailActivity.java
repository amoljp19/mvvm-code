package com.softaai.mvvmcode.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.softaai.mvvmcode.R;
import com.softaai.mvvmcode.databinding.ArticleDetailBinding;
import com.softaai.mvvmcode.di.MvvmCodeApp;
import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.viewmodel.ArticleDetailViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import javax.inject.Inject;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ArticleDetailActivity extends AppCompatActivity {

    private static final String EXTRA_ARTICLE = "EXTRA_ARTICLE";

    private ArticleDetailBinding articleDetailBinding;

    @Inject
    public ArticleDetailViewModel articleDetailViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        articleDetailBinding =
                DataBindingUtil.setContentView(this, R.layout.article_detail);
        getExtrasFromIntent();
    }


    public static Intent launchDetail(Context context, Results results) {
        Intent intent = new Intent(context, ArticleDetailActivity.class);
        intent.putExtra(EXTRA_ARTICLE, results);
        return intent;
    }


    private void getExtrasFromIntent() {
        Results results = (Results) getIntent().getSerializableExtra(EXTRA_ARTICLE);
//        articleDetailViewModel = new ArticleDetailViewModel(results);
        MvvmCodeApp.getComponent().inject(this);
        articleDetailBinding.setArticleDetailViewModel(articleDetailViewModel);
        setTitle(results.getTitle());

    }


}
