package com.softaai.mvvmcode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amol Pawar on 21-03-2019.
 * softAai Apps
 */
public class FakeApi {

    public static List<Results> getResultsList() {
        List<Results> peoples = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            peoples.add(getResults());
        }
        return peoples;
    }

    public static Results getResults() {
        Results results = new Results();
        results.setUrl("https://www.ny.com");
        results.setAbstract("This is abstract");
        results.setAdxKeywords("This is AdxKeyword");
        results.setAssetId(1.0);
        results.setByline("This is Byline");
        results.setColumn("This is Column");
        results.setDesFacet(new String("This is DesFacet"));
        results.setGeoFacet(new String("This is GeoFacet"));
        results.setId(2.0);
        results.setMedia(new ArrayList<MediaItem>());
        results.setOrgFacet(new String("This is OrgFacet"));
        results.setPerFacet(new String("This is PerFacet"));
        results.setPublishedDate("This is Publish Date");
        results.setSection("This is Section");
        results.setSource("This is Source");
        results.setTitle("This is Title");
        results.setType("This is Type");
        results.setViews(3);
        return results;
    }

}
