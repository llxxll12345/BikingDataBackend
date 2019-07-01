package com.bikingdata.backend.service;

import com.bikingdata.backend.domain.City;


public interface CityService {
    City findCityByName(String cityName);

    int insertCity(City city);
}
