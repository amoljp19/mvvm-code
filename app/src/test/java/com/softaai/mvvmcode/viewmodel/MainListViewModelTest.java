package com.softaai.mvvmcode.viewmodel;

import android.content.Context;
import android.view.View;

import com.softaai.mvvmcode.model.ArticleResponse;
import com.softaai.mvvmcode.model.FakeApi;
import com.softaai.mvvmcode.model.Results;
import com.softaai.mvvmcode.remote.ApiResponseManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import io.reactivex.Observable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

/**
 * Created by Amol Pawar on 21-03-2019.
 * softAai Apps
 */
@RunWith(MockitoJUnitRunner.class)
public class MainListViewModelTest {

    @Mock
    private MainListViewModel mainListViewModel;

    @Before
    public void setUpMainViewModelTest() {
        mainListViewModel = new MainListViewModel();
    }

    @Test
    public void ensureTheViewsAreInitializedCorrectly() {
        assertEquals(View.VISIBLE, mainListViewModel.articleProgress.get());
        assertEquals(View.VISIBLE, mainListViewModel.articleRecycler.get());
    }
}
