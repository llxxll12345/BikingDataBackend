package com.bikingdata.backend.controller;

import com.bikingdata.backend.service.CityService;
import com.bikingdata.backend.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    @ResponseBody
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        City res = cityService.findCityByName(cityName);
        System.out.println(res.getCityName() + " " + res.getDescription());
        return res;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/insertCity", method = RequestMethod.POST)
    public String insertCity(@RequestBody City city) {
        int res = cityService.insertCity(city);
        if (res != 0) {
            return "S";
        } else {
            return "F";
        }
    }

}
