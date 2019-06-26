package org.spring.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.event.EventRecodingLogger;
import org.slf4j.helpers.SubstituteLogger;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
