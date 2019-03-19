package com.softaai.mvvmcode.model;

import com.squareup.moshi.Json;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class MediaMetadataItem {

    @Json(name = "url")
    private String url;
    @Json(name = "format")
    private String format;
    @Json(name = "height")
    private Integer height;
    @Json(name = "width")
    private Integer width;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

}