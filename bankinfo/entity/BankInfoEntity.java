package com.xworkz.bankinfo.entity;

import javax.persistence.*;

@Entity
@Table(name = "bankInfo_table")
@NamedQuery(name = "updateByEmailAndPhoneNumber",query = "update SET et.email='nireeksha055@gmail.com', et.phoneNumber=6364201972 from bankInfo_table where bank_id=2 ")
@NamedQuery(name = "updateByPhoneNumberAndAliveAreNot",query = "update SET et.email='raksha@gmail.com', alive=1 where phone_number=8090898820")
@NamedQuery(name = "getAll",query = "select et from bankInfo_table et")
@NamedQuery(name = "getNameAndEmailById",query = "select et.name,et.email from bankInfo_table et where et.id=4")
@NamedQuery(name = "getCountByEmailAndDate",query = "select et from bankInfo_table et where et.email='lunagowda@gmail.com',et.date=25")
@NamedQuery(name = "getCountBywhereAge>15",query = "select et from bankInfo_table et where et.age>15")
@NamedQuery(name = "getNameAndEmailAndPhoneNumberById",query = "select et.name,et.email,et.phoneNumber et where et.id=5")
@NamedQuery(name = "getAllByEmailAndPhoneNumber",query = "select et from bankInfo_table et where et.email='nancyleema@gmail.com',et.phoneNumber=9901101102")
@NamedQuery(name = "getNameByTwoCondition",query = "select et.name from bankInfo_table et where et.id=10")
@NamedQuery(name = "deleteTheRowsWhereNameAndAge",query = "delete from bankInfo_table et where et.name =:byName and et.age= :byAge")
public class BankInfoEntity {
    @Id
    private int id;
    @Column(name = "person_name")
    private String name;
    @Column(name = "bank_email")
    private String email;
    @Column(name = "bank_phoneNumber")
    private String phoneNumber;
    @Column(name = "age")
    private int age;
    @Column(name = "bank_date")
    private int date;

    public BankInfoEntity(int id, String name, String email, String phoneNumber, int age, int date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.date = date;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public BankInfoEntity() {
        System.out.println("no agrument constructor");
    }
}
