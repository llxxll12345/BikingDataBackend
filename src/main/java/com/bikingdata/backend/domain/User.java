package com.bikingdata.backend.domain;

import java.sql.Date;

public class User {
    private Long userId;
    private String name;
    private String description;
    private int upVotes;
    private int gender;
    private Date dateJoined;
    private String serializedTags;
    private int type;
    private String city;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUpvotes(int upvotes) {
        this.upVotes = upvotes;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public int getGender() {
        return gender;
    }

    public int getUpvotes() {
        return upVotes;
    }

    public String getDescription() {
        return description;
    }

    public String getSerializedTags() {
        return serializedTags;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setSerializedTags(String serializedTags) {
        this.serializedTags = serializedTags;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
