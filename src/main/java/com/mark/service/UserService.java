package com.mark.service;

import com.mark.dao.UserDao;
import com.mark.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserDao userDao;

    public int insert(User pojo){
        return userDao.insert(pojo);
    }

    public int insertSelective(User pojo){
        return userDao.insertSelective(pojo);
    }

    public int insertList(List<User> pojos){
        return userDao.insertList(pojos);
    }

    public int update(User pojo){
        return userDao.update(pojo);
    }

    public User getByUserName(String userName){
        return userDao.getByUserName(userName);
    }
}
