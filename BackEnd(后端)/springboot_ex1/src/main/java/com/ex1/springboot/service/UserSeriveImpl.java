package com.ex1.springboot.service;

import com.ex1.springboot.dao.UserDAO;
import com.ex1.springboot.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserSeriveImpl implements IUserService {

    //自动装配，就是自动帮你get/set
    @Autowired
    UserDAO userDAO;


    @Override
    public List<Users> findAll() {
        return userDAO.findAll();
    }

    @Override
    public List<Users> findByName(String username) {
        return userDAO.findByName(username);
    }

    @Override
    public Users findOne(String username) {
        return userDAO.findByName(username).get(0);
    }


    @Override
    public void addUser(Users user) {
        userDAO.save(user);
    }
}
