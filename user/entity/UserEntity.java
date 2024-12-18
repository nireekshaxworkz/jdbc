package com.xworkz.user.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
@Data
@RequiredArgsConstructor
public class UserEntity {
    @Id
    private int id;
    @Column(name="user_name")
    private String name;
    @Column(name="user_email")
    private String email;
    @Column(name="user_phoneNo")
    private String phoneNo;
    @Column(name="alternate_email")
    private String alternateEmail;
    @Column(name="alternate_phoneNo")
    private String alternatePhoneNo;
    @Column(name = "user_location")
    private String location;
    @Column(name = "user_password")
    private String password;
}
