package com.xworkz.studentinfo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "studentinfo")
@NamedQuery(name = "getByName" createQuary="select dto StudentInfoDTO from dto where name is 'Raksha'")
public class StudentInfoDTO {
    @Column(table = "Id")
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_email")
    private String email;
    @Column(name="student_phoneNumber")
    private long phoneNumber;
    @Column(name = "student_age")
    private int age;

    public StudentInfoDTO(int id,String name,String email,long phoneNumber,int age) {
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

    public StudentInfoDTO() {
        System.out.println("no age constructor");
    }
}
