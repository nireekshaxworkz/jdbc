package com.xworkz.jdbc.dto;

public class BusTicketDto {
    private String name;
    private Long phoneNo;
    private String email;
    private int age;

    public BusTicketDto(String name,Long phoneNo,String email,int age) {
        this.name = name;
        this.phoneNo=phoneNo;
        this.email=email;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
