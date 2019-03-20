package com.softaai.mvvmcode.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.softaai.mvvmcode.R;
import com.softaai.mvvmcode.databinding.ArticleItemBinding;
import com.softaai.mvvmcode.model.ArticleResponse;
import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.viewmodel.ArticleItemViewModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ArticleItemAdapter extends RecyclerView.Adapter<ArticleItemAdapter.ArticleItemAdapterViewHolder> {

    private List<Results> articleList;

    public ArticleItemAdapter() {
        this.articleList = new ArrayList<>();
    }



    @NonNull
    @Override
    public ArticleItemAdapter.ArticleItemAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ArticleItemBinding itemPeopleBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.article_item,
                        parent, false);
        return new ArticleItemAdapterViewHolder(itemPeopleBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull ArticleItemAdapterViewHolder holder, int position) {

        holder.bindArticleResponse(articleList.get(position));

    }

    @Override
    public int getItemCount() {
        if(articleList != null){
            return articleList.size();
        }
        else{
            return 0;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public void setArticleList(List<Results> articleList) {
        this.articleList = articleList;
        notifyDataSetChanged();
    }





    static class ArticleItemAdapterViewHolder extends RecyclerView.ViewHolder {
        ArticleItemBinding mArticleItemBinding;

        ArticleItemAdapterViewHolder(ArticleItemBinding mArticleItemBinding) {
            super(mArticleItemBinding.itemArticle);
            this.mArticleItemBinding = mArticleItemBinding;
        }

        public void bindArticleResponse(Results results) {
            if (mArticleItemBinding.getArticleItemViewModel() == null) {
                mArticleItemBinding.setArticleItemViewModel(
                        new ArticleItemViewModel(results, itemView.getContext()));
            } else {
                mArticleItemBinding.getArticleItemViewModel().setArticleResponse(results);
            }
        }
    }
}
