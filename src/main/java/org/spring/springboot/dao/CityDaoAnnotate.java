package org.spring.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.spring.springboot.domain.City;

public interface CityDaoAnnotate {
    @Select("SELECT * FROM city")

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);


}
