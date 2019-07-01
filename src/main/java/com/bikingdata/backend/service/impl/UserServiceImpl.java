package com.bikingdata.backend.service.impl;

import com.bikingdata.backend.dao.UserDao;
import com.bikingdata.backend.domain.User;
import com.bikingdata.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public User getById(Integer id) {
        return null;
    }

    public User getByName(String name) {
        return null;
    }

    public String getByType(int type) {
        return null;
    }

    public List<User> getByDateRange(Date date1, Date date2) {
        return null;
    }

    public String getGender(int gender) {
        return null;
    }

    public List<User> getCountributionRange(int cont1, int cont2) {
        return null;
    }

    public User createUser(User user) {
        return null;
    }
}
