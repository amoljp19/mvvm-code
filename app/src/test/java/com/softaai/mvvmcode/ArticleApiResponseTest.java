package com.softaai.mvvmcode;

import com.softaai.mvvmcode.model.ApiResponse;
import com.softaai.mvvmcode.remote.ApiResponseManager;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ArticleApiResponseTest {

    private CountDownLatch countDownLatch;


    @Test
    public void testAPI() throws InterruptedException {
        countDownLatch = new CountDownLatch(1);
        ApiResponseManager apiResponseManager = new ApiResponseManager();
        apiResponseManager.getArticles("7", new ApiResponseManager.ApiCallback<ApiResponse>() {
            @Override
            public void success(ApiResponse response) {
                if (countDownLatch != null)
                    countDownLatch.countDown();

                assertNotNull(response);
                assertEquals(response.getStatus(), "OK");
            }

            @Override
            public void failure(int responseCode) {
                if (countDownLatch != null)
                    countDownLatch.countDown();
            }
        });

        countDownLatch.await();

    }
}