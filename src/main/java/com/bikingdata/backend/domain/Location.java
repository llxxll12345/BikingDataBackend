package com.bikingdata.backend.domain;

public class Location {
    private Long locationId;
    private String name;
    private Long userId;    // creator
    private String tag;
    private Long routeId;
    private String serializedUrls;
    private Long upVotes;
    private Boolean isPrivate;

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

    public String getSerializedUrls() {
        return serializedUrls;
    }

    public String getTag() {
        return tag;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public void setSerializedUrls(String serializedUrls) {
        this.serializedUrls = serializedUrls;
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
}
