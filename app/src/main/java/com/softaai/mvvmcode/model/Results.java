package com.softaai.mvvmcode.model;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class Results {

    @Json(name = "url")
    private String url;
    @Json(name = "adx_keywords")
    private String adxKeywords;
    @Json(name = "column")
    private String column;
    @Json(name = "section")
    private String section;
    @Json(name = "byline")
    private String byline;
    @Json(name = "type")
    private String type;
    @Json(name = "title")
    private String title;
    @Json(name = "abstract")
    private String _abstract;
    @Json(name = "published_date")
    private String publishedDate;
    @Json(name = "source")
    private String source;
    @Json(name = "id")
    private Integer id;
    @Json(name = "asset_id")
    private Integer assetId;
    @Json(name = "views")
    private Integer views;
    @Json(name = "des_facet")
    private List<String> desFacet = null;
    @Json(name = "org_facet")
    private List<String> orgFacet = null;
    @Json(name = "per_facet")
    private String perFacet;
    @Json(name = "geo_facet")
    private String geoFacet;
    @Json(name = "media")
    private List<MediaItem> media = null;
    @Json(name = "uri")
    private String uri;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAdxKeywords() {
        return adxKeywords;
    }

    public void setAdxKeywords(String adxKeywords) {
        this.adxKeywords = adxKeywords;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public List<String> getDesFacet() {
        return desFacet;
    }

    public void setDesFacet(List<String> desFacet) {
        this.desFacet = desFacet;
    }

    public List<String> getOrgFacet() {
        return orgFacet;
    }

    public void setOrgFacet(List<String> orgFacet) {
        this.orgFacet = orgFacet;
    }

    public String getPerFacet() {
        return perFacet;
    }

    public void setPerFacet(String perFacet) {
        this.perFacet = perFacet;
    }

    public String getGeoFacet() {
        return geoFacet;
    }

    public void setGeoFacet(String geoFacet) {
        this.geoFacet = geoFacet;
    }

    public List<MediaItem> getMedia() {
        return media;
    }

    public void setMedia(List<MediaItem> media) {
        this.media = media;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}