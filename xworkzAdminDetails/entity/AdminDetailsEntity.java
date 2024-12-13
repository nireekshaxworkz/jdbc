package com.xworkz.xworkzAdminDetails.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "admin_table")
public class AdminDetailsEntity {
    @Id
    @GenericGenerator(name ="ref" , strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="confirmpassword")
    private String confirmPassword;
    @Column(name = "phone")
    private String phone;

    public AdminDetailsEntity(int id,String name, int age, String email, String password, String confirmPassword, String phone) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AdminDetailsEntity() {
        System.out.println("no arg constructor");
    }
}
