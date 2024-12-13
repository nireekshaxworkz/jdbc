package com.xworkz.xworkzAdminDetails.dto.AdminDetails;

public class AdminDetailsDTO {
    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String confirmPassword;
    private String phone;

    public AdminDetailsDTO(int id,String name, int age, String email, String password, String confirmPassword, String phone) {
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AdminDetailsDTO() {
        System.out.println("no agr constructor");
    }
}
