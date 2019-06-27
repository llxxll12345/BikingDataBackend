package com.bikingdata.backend.domain;

public class Route {
    private Long routeId;
    private Long userId;
    private String name;
    private Long StartId;
    private Long EndId;
    private String serializedRoute;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getName() {
        return name;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEndId() {
        return EndId;
    }

    public Long getStartId() {
        return StartId;
    }

    public String getSerializedRoute() {
        return serializedRoute;
    }

    public void setEndId(Long endId) {
        EndId = endId;
    }

    public void setSerializedRoute(String serializedRoute) {
        this.serializedRoute = serializedRoute;
    }

    public void setStartId(Long startId) {
        StartId = startId;
    }
}
