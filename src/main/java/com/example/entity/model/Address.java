package com.example.entity.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Address {
    private Integer id;
    private String name;
    private Integer parentid;

    public Address(){

    }

    public Address(Integer id, String name, Integer parentid) {
        this.id = id;
        this.name = name;
        this.parentid = parentid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
