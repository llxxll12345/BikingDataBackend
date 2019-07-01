package com.bikingdata.backend.service.impl;

import com.bikingdata.backend.dao.CityDao;
import com.bikingdata.backend.dao.LocationDao;
import com.bikingdata.backend.domain.Location;
import com.bikingdata.backend.service.LocationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDao locationDao;

    public int insertLocation(Location location) {
        return locationDao.insertLocation(
            location.getName(),
            location.getUserId(),
            location.getTag(),
            location.getRouteId(),
            location.getUrls(),
            location.getUpvotes(),
            location.getPrivate(),
            location.getLongitude(),
            location.getLatitude(),
            location.getRegion()
        );
    }

    public int updateLocation(Location location) {
        return locationDao.updateLocation(
                location.getName(),
                location.getUserId(),
                location.getTag(),
                location.getRouteId(),
                location.getUrls(),
                location.getUpvotes(),
                location.getPrivate(),
                location.getLongitude(),
                location.getLatitude(),
                location.getRegion()
        );
    }

    public int deleteLocation(Long locationId) {
        return locationDao.deleteLocation(locationId);
    }

    public Location findLocation(Long locationId) {
        return locationDao.findLocation(locationId);
    }

    // test: asdfasdf#asdfasdf#asdfawefasdf#四大发明#asdf#
    public List<Location> findTag(String tag) {
        return locationDao.findTag(".*#"+tag+"#.*");
    }

    public List<Location> findLocationNearby(int latitude, int longitude) {
        return locationDao.findLocationNearby(latitude, longitude);
    }

    public List<Location> getLocationByRoute(int routeId) {
        return locationDao.getLocationByRoute(routeId);
    }

    public List<Location> findLocName(String locName) {
        return locationDao.findLocName("%" + locName + "%");
    }
}
