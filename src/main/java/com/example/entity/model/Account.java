package com.example.entity.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Date;

public class Account {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Date birthday;
    private Integer idcity;
    private Integer iddistrict;
    private Integer idstreet;

    public Account(){

    }

    public Account(Integer id, String username, String password, String email, Date birthday, Integer idcity, Integer iddistrict, Integer idstreet) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.idcity = idcity;
        this.iddistrict = iddistrict;
        this.idstreet = idstreet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getIdcity() {
        return idcity;
    }

    public void setIdcity(Integer idcity) {
        this.idcity = idcity;
    }

    public Integer getIddistrict() {
        return iddistrict;
    }

    public void setIddistrict(Integer iddistrict) {
        this.iddistrict = iddistrict;
    }

    public Integer getIdstreet() {
        return idstreet;
    }

    public void setIdstreet(Integer idstreet) {
        this.idstreet = idstreet;
    }
}
