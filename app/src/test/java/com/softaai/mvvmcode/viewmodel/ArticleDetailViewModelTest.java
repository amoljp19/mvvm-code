package com.softaai.mvvmcode.viewmodel;

import android.content.Context;

import com.softaai.mvvmcode.model.FakeApi;
import com.softaai.mvvmcode.model.Results;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Amol Pawar on 21-03-2019.
 * softAai Apps
 */
@RunWith(MockitoJUnitRunner.class)
public class ArticleDetailViewModelTest {
    @Mock
    Results results;

    private ArticleDetailViewModel articleDetailViewModel;

    @Before
    public void setUpArticleDetailViewModelTest() {
        results = FakeApi.getResults();
        articleDetailViewModel = new ArticleDetailViewModel(results);
    }

    @Test
    public void shouldGetTitle() throws Exception {
        assertEquals(results.getTitle(), articleDetailViewModel.getTitle());
    }

    @Test
    public void shouldGetByline() throws Exception {
        assertEquals(results.getByline(), articleDetailViewModel.getByline());
    }

    @Test
    public void shouldGetPublishedDate() throws Exception {
        assertEquals(results.getPublishedDate(), articleDetailViewModel.getPublishedDate());
    }


    @Test
    public void shouldGetViews() throws Exception {
        assertEquals(results.getViews(), Integer.valueOf(articleDetailViewModel.getViews()));
    }

    @Test
    public void shouldGetSource() throws Exception {
        assertEquals(results.getSource(), articleDetailViewModel.getSource());
    }

    @Test
    public void shouldGetSection() throws Exception {
        assertEquals(results.getSection(), articleDetailViewModel.getSection());
    }

    @Test
    public void shouldGetAbstract() throws Exception {
        assertEquals(results.getAbstract(), articleDetailViewModel.getAbstract());
    }

    @Test
    public void shouldGetAdxKeywords() throws Exception {
        assertEquals(results.getAdxKeywords(), articleDetailViewModel.getAdxKeywords());
    }

    @Test
    public void shouldGetType() throws Exception {
        assertEquals(results.getType(), articleDetailViewModel.getType());
    }


    @Test(expected = NullPointerException.class)
    public void shouldGetUrl() throws Exception {
        results = new Results();
        assertEquals(results.getMedia().get(0).getMediaMetadata().get(0).getUrl(), articleDetailViewModel.getUrl());
    }
}
