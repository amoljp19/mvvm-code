package com.softaai.mvvmcode.model;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by Amol Pawar on 20-03-2019.
 * softAai Apps
 */
public class ApiResponse {

    @Json(name = "status")
    private String status;
    @Json(name = "copyright")
    private String copyright;
    @Json(name = "num_results")
    private Integer numResults;
    @Json(name = "results")
    private List<Results> results = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

}
