package com.bikingdata.backend.service;

import com.bikingdata.backend.domain.Location;
import com.bikingdata.backend.domain.Route;

import java.util.List;

public interface RouteService {
    Route getRoute(int id);

    List<Route> getRouteByStart(int location_id);

    List<Route> getRouteByEnd(int location_id);

    List<Route> getRouteNerby(int latitude, int longitude);

    int insertRoute(Route route);

    int deleteRoute(Route route);
}
