package com.bikingdata.backend.dao;

import org.apache.ibatis.annotations.Param;
import com.bikingdata.backend.domain.City;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityDao {

    City findByName(@Param("cityName") String cityName);

    int insertCity(@Param("provinceId") long provinceId,@Param("cityName") String cityName,@Param("description")String description);
}
