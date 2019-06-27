package com.bikingdata.backend.service;

import com.bikingdata.backend.domain.Location;

public interface LocationService {
    public int insertLocation(Location location);

    public int updateLocation(Location location);

    public int deleteLocation(Long locationId);

    public Location findLocation(Long locationId);

    public Location findTag(String tag);
}
