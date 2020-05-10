package com.ex1.springboot.dao;

import com.ex1.springboot.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository 已经提供各种db操作接口，无需二次开发
//泛型<Users,Integer>表示这是个针对User类的DAO，Intger表示主键是Integer类型
public interface GoodDAO extends JpaRepository<Goods, Integer> {
    //查找某个商品
    public List<Goods> findByGoodname(String goodname);

    //查找某个用户id发布的商品
    public List<Goods> findByUserid(int userid );
    //查找某个id商品
    public List<Goods> findByGoodid(int goodid );
}
