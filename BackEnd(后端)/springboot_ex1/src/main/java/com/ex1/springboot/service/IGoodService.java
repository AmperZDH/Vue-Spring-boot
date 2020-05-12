package com.ex1.springboot.service;

import com.ex1.springboot.pojo.Goods;

import java.util.List;

public interface IGoodService {
    List<Goods> findAll();

    List<Goods> findByUserid(int userid);

    void addGood(Goods good);

    void deleteById(int goodid);

    void updateGood(int id);
}
