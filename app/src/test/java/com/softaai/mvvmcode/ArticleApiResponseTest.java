package com.softaai.mvvmcode;

import com.softaai.mvvmcode.model.ArticleResponse;
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
        apiResponseManager.getArticles("30", new ApiResponseManager.ApiCallback<ArticleResponse>() {
            @Override
            public void success(ArticleResponse response) {
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
