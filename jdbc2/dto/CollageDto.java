package com.xworkz.jdbc2.dto;

public class CollageDto {
    private String Name;
    private int Age;
    private String Email;
    private String CollageName;
    private String Stream;

    public CollageDto(String name,int age,String email,String collageName,String stream) {
        this.Name = name;
        this.Age=age;
        this.Email=email;
        this.CollageName=collageName;
        this.Stream=stream;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCollageName() {
        return CollageName;
    }

    public void setCollageName(String collageName) {
        CollageName = collageName;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }
}
