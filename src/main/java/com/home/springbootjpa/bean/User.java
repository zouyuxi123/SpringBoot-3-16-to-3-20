package com.home.springbootjpa.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * @author: 邹玉玺
 * @date: 2020/3/18-21:59
 */
//使用jpa注解配置映射关系
@Entity   //告诉jpa这是一个实体类
@Table(name ="user")    //和哪一张表关联
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class User {
    @Id//这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer uid;
    @Column(name = "uname")
    private String uname;
    @Column(name = "age")//不写默认是属性名
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


