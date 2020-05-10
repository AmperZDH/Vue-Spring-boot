package com.ex1.springboot.dao;

import com.ex1.springboot.pojo.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository 已经提供各种db操作接口，无需二次开发
//泛型<Users,Integer>表示这是个针对Users类的DAO，Intger表示主键是Integer类型
public interface UserDAO extends JpaRepository<Users, Integer> {
    public List<Users> findByName(String name);
}
