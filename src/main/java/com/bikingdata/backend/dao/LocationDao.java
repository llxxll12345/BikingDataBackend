package com.bikingdata.backend.dao;

import com.bikingdata.backend.domain.City;
import com.bikingdata.backend.domain.Location;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LocationDao {
    public int insertLocation(
            @Param("locName") String locName,
            @Param("userId")  Long userId,
            @Param("tag")    String tag,
            @Param("routeId") Long routeId,
            @Param("urls")    String urls,
            @Param("upVotes")  Long upVotes,
            @Param("isPrivate") Boolean isPrivate,
            @Param("longitude") Double longitude,
            @Param("latitude") Double latitude,
            @Param("region") String region);

    public int updateLocation(
                              @Param("locName") String locName,
                              @Param("userId")  Long userId,
                              @Param("tag")    String tag,
                              @Param("routeId") Long routeId,
                              @Param("urls")    String urls,
                              @Param("upVotes")  Long upVotes,
                              @Param("isPrivate") Boolean isPrivate,
                              @Param("longitude") Double longitude,
                              @Param("latitude") Double latitude,
                              @Param("region") String region);

    public int deleteLocation(@Param("locationId") Long locationId);

    public Location findLocation(@Param("locationId") Long locationId);

    public List<Location> findTag(@Param("tag") String tag);

    public List<Location> findLocationNearby(@Param("latitude") int latitude,
                                       @Param("longitude") int longitude);

    public List<Location> getLocationByRoute(@Param("routeId") int routeId);

    public List<Location> findLocName(@Param("locName") String locName);
}
