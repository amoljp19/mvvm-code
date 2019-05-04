package com.softaai.mvvmcode.viewmodel;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.inject.Inject;

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

    @Inject
    @Mock
    private MainListViewModel mainListViewModel;

    @Before
    public void setUpMainViewModelTest() {
        //mainListViewModel = new MainListViewModel();
        MvvmCodeApp.getComponent().inject(mainListViewModel);
    }

    @Test
    public void ensureTheViewsAreInitializedCorrectly() {
        assertEquals(View.VISIBLE, mainListViewModel.articleProgress.get());
        assertEquals(View.VISIBLE, mainListViewModel.articleRecycler.get());
    }
}
