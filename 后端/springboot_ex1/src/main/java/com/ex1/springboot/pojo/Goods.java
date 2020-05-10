package com.ex1.springboot.pojo;

import javax.persistence.*;

@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标注主键，且为自增长型
    @Column(name = "goodid")
    private int goodid;

    @Column(name = "userid")
    private int userid;

    @Column(name = "goodname")
    private String goodname;

    @Column(name = "price")
    private float price;

    @Column(name = "info")
    private String info;

    @Column(name = "isbuy")
    private int isbuy;//卖出是0,未卖出为1

    public int getGoodid() {
        return goodid;
    }

    public void setGoodid(int goodid) {
        this.goodid = goodid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getIsbuy() {
        return isbuy;
    }

    public void setIsbuy(int isbuy) {
        this.isbuy = isbuy;
    }
}
