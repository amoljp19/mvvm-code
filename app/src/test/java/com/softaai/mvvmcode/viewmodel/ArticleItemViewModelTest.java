package com.softaai.mvvmcode.viewmodel;

import android.content.Context;
import android.content.Intent;

import com.softaai.mvvmcode.model.FakeApi;
import com.softaai.mvvmcode.model.MediaItem;
import com.softaai.mvvmcode.model.MediaMetadataItem;
import com.softaai.mvvmcode.model.Results;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Amol Pawar on 21-03-2019.
 * softAai Apps
 */

@RunWith(MockitoJUnitRunner.class)
public class ArticleItemViewModelTest {
    @Mock
    Results results;

    private Context mockContext;
    @Mock
    private ArticleItemViewModel articleItemViewModel;

    @Before
    public void initMocks() {
        mockContext = mock(Context.class);
        results = new Results();
        articleItemViewModel = new ArticleItemViewModel(results, mockContext);
    }

    @Test
    public void shouldGetTitle() throws Exception {
        assertEquals(results.getTitle(), articleItemViewModel.getTitle());
    }

    @Test
    public void shouldGetByline() throws Exception {
        assertEquals(results.getByline(), articleItemViewModel.getByline());
    }

    @Test
    public void shouldGetPublishedDate() throws Exception {
        assertEquals(results.getPublishedDate(), articleItemViewModel.getPublishedDate());
    }

    @Test(expected = NullPointerException.class)
    public void shouldGetUrl() throws Exception {
        assertEquals(results.getMedia().get(0).getMediaMetadata().get(0).getUrl(), articleItemViewModel.getUrl());
    }


    @Test
    public void shouldStartArticleDetailActivityOnItemClick() throws Exception {
        articleItemViewModel.onItemClick(new MockView(mockContext));
        verify(mockContext).startActivity(any(Intent.class));
    }


}
