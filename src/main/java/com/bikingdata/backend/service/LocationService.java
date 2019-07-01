package com.bikingdata.backend.service;

import com.bikingdata.backend.domain.Location;

import java.util.List;

public interface LocationService {
    public int insertLocation(Location location);

    public int updateLocation(Location location);

    public int deleteLocation(Long locationId);

    public Location findLocation(Long locationId);

    public List<Location> findTag(String tag);

    public List<Location> findLocationNearby(int latitude, int longitude);

    public List<Location> getLocationByRoute(int route_id);

    public List<Location> findLocName(String locName);
}
