package com.ex1.springboot.pojo;

import javax.persistence.*;

@Entity //表示是该类的是一个实体
@Table(name = "users") //表示该类对应的表名是 users
public class Users {

    @Id //该字段是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //同上
    @Column(name = "userid") //表示id变量对应表中的userid参数
    private int id;

    @Column(name = "username")
    private String name;

    @Column(name = "pwd")
    private String pwd;

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() { return pwd; }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
