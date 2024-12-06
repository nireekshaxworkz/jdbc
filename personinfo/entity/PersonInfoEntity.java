package com.xworkz.personinfo.entity;

import javax.persistence.*;

@Entity
@Table(name = "personinfo_table")
@NamedQuery(name = "findIdByName",query ="select et from PersoInfoEntity et where name= :'byName'" )
@NamedQuery(name = "findNameByEmail",query ="select et from PersoInfoEntity et where email= :'byEmail'" )
@NamedQuery(name = "findEmailByPhoneNumber",query ="select et from PersoInfoEntity et where phoneNumber= :'byPhoneNumber'" )
@NamedQuery(name = "findPhoneNumberByAge",query ="select et from PersoInfoEntity et where age= :'byAge'" )
@NamedQuery(name = "findAll",query ="select et from PersoInfoEntity et" )

public class PersonInfoEntity {
    @Id
    private int id;
    @Column(name = "person_name")
    private String name;
    @Column(name = "person_email")
    private String email;
    @Column(name = "person_phoneNumber")
    private long phoneNumber;
    @Column(name = "person_age")
    private int age;

    public PersonInfoEntity(int id,String name,String email,long phoneNumber,int age) {
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
