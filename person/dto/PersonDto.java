package com.xworkz.jdbc.person.dto;

public class PersonDto {
    private int id;
    private String name;
    private String email;
    private Long phoneNo;
    private String password;

    public PersonDto(int id,String name,String email,Long phoneNo,String password) {
        this.id = id;
        this.name=name;
        this.email=email;
        this.phoneNo=phoneNo;
        this.password=password;
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

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
