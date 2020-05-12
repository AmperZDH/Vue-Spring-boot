package com.ex1.springboot.service;

import com.ex1.springboot.pojo.Users;


import java.util.List;

public interface IUserService {
    List<Users> findAll();

    List<Users> findByName(String username);

    Users findOne(String username);

    void addUser(Users user);

}
