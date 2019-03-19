package com.softaai.mvvmcode.model;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class MediaItem {

    @Json(name = "type")
    private String type;
    @Json(name = "subtype")
    private String subtype;
    @Json(name = "caption")
    private String caption;
    @Json(name = "copyright")
    private String copyright;
    @Json(name = "approved_for_syndication")
    private Integer approvedForSyndication;
    @Json(name = "media-metadata")
    private List<MediaMetadataItem> mediaMetadata = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getApprovedForSyndication() {
        return approvedForSyndication;
    }

    public void setApprovedForSyndication(Integer approvedForSyndication) {
        this.approvedForSyndication = approvedForSyndication;
    }

    public List<MediaMetadataItem> getMediaMetadata() {
        return mediaMetadata;
    }

    public void setMediaMetadata(List<MediaMetadataItem> mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
    }

}

