package com.xworkz.collageinfo.entity;

import javax.persistence.*;

@Entity
@Table(name = "collage_table")
@NamedQuery(name = "findIdByName",query = "select et from CollageInfoEntity et where name='Raksha'")
@NamedQuery(name = "findNameByEmail",query = "select et from CollageInfoEntity et where email='raksha25@gmail.com'")
@NamedQuery(name = "findEmailByPhoneNumber",query = "select et from CollageInfoEntity et where phoneNumber=6361208972l")
@NamedQuery(name = "findPhoneNumberByAge",query = "select et from CollageInfoEntity where age=21")
@NamedQuery(name = "findAll",query = "select et from CollageInfoEntity")
public class CollageInfoEntity {
    @Id
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private long phoneNumber;
    @Column(name = "age")
    private int age;

    public CollageInfoEntity(int id,String name,String email,long phoneNumber,int age) {
        this.id = id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
