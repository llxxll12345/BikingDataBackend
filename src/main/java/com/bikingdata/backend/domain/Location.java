package com.bikingdata.backend.domain;

public class Location {
    private Long locationId;
    private String name;
    private Long userId;    // creator
    private String tag;
    private Long routeId;
    private String urls;
    private Long upVotes;
    private Boolean isPrivate;
    private Double longitude;
    private Double latitude;
    private String region;

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRouteId() {
        return routeId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getUpvotes() {
        return upVotes;
    }

    public String getName() {
        return name;
    }

    public String getUrls() {
        return urls;
    }

    public String getTag() {
        return tag;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setUpvotes(Long upVotes) {
        this.upVotes = upVotes;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
