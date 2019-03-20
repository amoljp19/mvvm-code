package com.softaai.mvvmcode.viewmodel;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.softaai.mvvmcode.R;
import com.softaai.mvvmcode.model.ArticleResponse;
import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.view.ArticleDetailActivity;
import com.squareup.picasso.Picasso;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModel;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ArticleItemViewModel  extends ViewModel {

    private Results results;
    private Context context;

    public ArticleItemViewModel(Results results, Context context) {
          this.results = results;
          this.context = context;
    }


    public String getTitle(){
        return results.getTitle();
    }

    public String getByline(){
        return results.getByline();
    }

    public String getPublishedDate(){
        return results.getPublishedDate();
    }

    public String getUrl(){
        return results.getMedia().get(0).getMediaMetadata().get(0).getUrl();
    }


    @BindingAdapter("imageUrl") public static void setImageUrl(ImageView imageView, String url) {
        //Glide.with(imageView.getContext()).load(url).into(imageView);
        Picasso.with(imageView.getContext()).load(url).placeholder(R.drawable.icon).into(imageView);
    }

    public void onItemClick(View view) {
        context.startActivity(ArticleDetailActivity.launchDetail(view.getContext(), results));
    }


    public void setArticleResponse(Results response) {
          this.results = response;
    }
}
