package com.bikingdata.backend.service;

import com.bikingdata.backend.domain.User;

import java.sql.Date;
import java.util.List;


/*
*  private Long userId;
    private String name;
    private String description;
    private int upVotes;
    private int gender;
    private int contributions;
    private Date dateJoined;
    private int type;
*
* */

public interface UserService {
    public User getById(Integer id);

    public User getByName(String name);

    public String getByType(int type);

    public List<User> getByDateRange(Date date1, Date date2);

    public String getGender(int gender);

    public List<User> getCountributionRange(int cont1, int cont2);

    public User createUser(User user);
}


