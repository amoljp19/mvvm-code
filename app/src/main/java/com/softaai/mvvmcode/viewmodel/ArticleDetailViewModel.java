package com.softaai.mvvmcode.viewmodel;

import android.content.Context;
import android.widget.ImageView;

import com.softaai.mvvmcode.R;
import com.softaai.mvvmcode.model.Results;
import com.squareup.picasso.Picasso;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

/**
 * Created by Amol Pawar on 21-03-2019.
 * softAai Apps
 */
public class ArticleDetailViewModel  extends ViewModel{

    public Results results;

    @Inject
    public ArticleDetailViewModel(Results results) {
        this.results = results;
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

    public int getViews(){
        return results.getViews();
    }

    public String getSource(){
        return results.getSource();
    }

    public String getSection(){
        return results.getSection();
    }


    public String getAbstract(){
        return results.getAbstract();
    }

    public String getAdxKeywords(){
        return results.getAdxKeywords();
    }

    public String getType(){
        return results.getType();
    }

    @BindingAdapter("imageUrl") public static void setImageUrl(ImageView imageView, String url) {
        //Glide.with(imageView.getContext()).load(url).into(imageView);
        Picasso.with(imageView.getContext()).load(url).placeholder(R.drawable.icon).into(imageView);
    }


    public void setArticleResponse(Results response) {
        this.results = response;
    }

}
