package com.bikingdata.backend.service.impl;

import com.bikingdata.backend.service.CityService;
import com.bikingdata.backend.dao.CityDao;
import com.bikingdata.backend.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    @Override
    public int insertCity(City city) {
        return cityDao.insertCity(city.getProvinceId(), city.getCityName(), city.getDescription());
    }
}
