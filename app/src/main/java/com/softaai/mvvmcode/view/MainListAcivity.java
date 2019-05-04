package com.softaai.mvvmcode.view;

import android.os.Bundle;

import com.softaai.mvvmcode.R;
import com.softaai.mvvmcode.adapter.ArticleItemAdapter;
import com.softaai.mvvmcode.databinding.ActivityMainBinding;
import com.softaai.mvvmcode.di.MvvmCodeApp;
import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.viewmodel.MainListViewModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import javax.inject.Inject;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class MainListAcivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;
    @Inject
    public MainListViewModel mainListViewModel;

    @Inject
    public ArticleItemAdapter adapter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataBinding();
        setupMainListView(activityMainBinding.rvArticle);
        observeViewModel(mainListViewModel);

    }


    private void initDataBinding() {
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //mainListViewModel = ViewModelProviders.of(this).get(MainListViewModel.class);
//        mainListViewModel = new MainListViewModel();
        MvvmCodeApp.getComponent().inject(this);
        activityMainBinding.setMainListViewModel(mainListViewModel);
    }

    private void setupMainListView(RecyclerView listArticle) {

        listArticle.setLayoutManager(new LinearLayoutManager(this));
        //adapter = new ArticleItemAdapter();
        adapter.setArticleList(mainListViewModel.getArticles().getValue());
        listArticle.setAdapter(adapter);

    }

    private void observeViewModel(MainListViewModel mainListViewModel){

        mainListViewModel.getArticles().observe(this, new Observer<List<Results>>() {
            @Override
            public void onChanged(List<Results> results) {
                if (results != null) {
                    adapter.setArticleList(results);
                }
            }

        });


    }


}
