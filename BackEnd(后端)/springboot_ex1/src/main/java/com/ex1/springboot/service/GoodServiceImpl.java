package com.ex1.springboot.service;

import com.ex1.springboot.dao.GoodDAO;
import com.ex1.springboot.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoodServiceImpl implements IGoodService {

    @Autowired
    GoodDAO goodDAO;

    @Override
    public List<Goods> findAll() {
        return goodDAO.findAll();
    }

    @Override
    public List<Goods> findByUserid(int userid) {
        return goodDAO.findByUserid(userid);
    }

    @Override
    public void addGood(Goods good) {
        goodDAO.save(good);
    }

    @Override
    public void deleteById(int goodid) {
        goodDAO.deleteById(goodid);
    }

    @Override
    public void updateGood(int id) {
        List<Goods> goodslist = goodDAO.findByGoodid(id);
        Goods good = goodslist.get(0);
        good.setIsbuy(0);
        goodDAO.save(good);
    }
}
