package com.bikingdata.backend.controller;

import com.bikingdata.backend.domain.City;
import com.bikingdata.backend.domain.Location;
import com.bikingdata.backend.service.CityService;
import com.bikingdata.backend.service.LocationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;


    @CrossOrigin
    @PostMapping(value = "insertLocation")
    public String insertLocation(@RequestBody Location location) {
        int res = locationService.insertLocation(location);
        if (res != 0) {
            return "insertlocS";
        } else {
            return "insertlocF";
        }
    }

    @CrossOrigin
    @PostMapping(value = "insertLocation")
    public String updateLocation(@RequestBody Location location) {
        int res = locationService.updateLocation(location);
        if (res != 0) {
            return "ulS";
        } else {
            return "ulF";
        }
    }

    @CrossOrigin
    @GetMapping(value = "deleteLocation")
    public String deleteLocation(@RequestParam(value = "locName", required = true) Long locId) {
        int res = locationService.deleteLocation(locId);
        if (res != 0) {
            return "dlS";
        } else {
            return "dlF";
        }
    }

    @CrossOrigin
    @GetMapping(value = "findLocation")
    @ResponseBody
    public Location findLocation(@RequestParam(value = "locationId", required = true) Long locationId) {
        Location location = locationService.findLocation(locationId);
        return location;
    }

    @CrossOrigin
    @GetMapping(value = "tag")
    @ResponseBody
    public List<Location> findTag(@RequestParam("tag") String tag) {
        List<Location> locationList = locationService.findTag(tag);
        return locationList;
    }

    @CrossOrigin
    @GetMapping(value = "locNearby")
    @ResponseBody
    public List<Location> findLocationNearby(@RequestParam("latitude") int latitude,
                                       @RequestParam("longitude") int longitude) {
        List<Location> locationList = locationService.findLocationNearby(latitude, longitude);
        return locationList;
    }

    @CrossOrigin
    @GetMapping(value = "locRoute")
    @ResponseBody
    public List<Location> getLocationByRoute(@RequestParam("routeId") int routeId) {
        List<Location> locationList = locationService.getLocationByRoute(routeId);
        return locationList;
    }

    @CrossOrigin
    @GetMapping(value = "findLocName")
    @ResponseBody
    public List<Location> findLocName(@RequestParam("locName") String locName) {
        List<Location> location = locationService.findLocName(locName);
        return location;
    }
}
