package com.xworkz.watchDTO;

import javax.persistence.*;

@Entity
@Table(name="watch_table")
public class WatchDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="brand")
    private String brand;
    @Column(name="cost")
    private int cost;

    public WatchDTO() {
        System.out.println("no arg constructor");
    }

    public WatchDTO(int id,String name,String brand,int cost) {
        this.id = id;
        this.name=name;
        this.brand=brand;
        this.cost=cost;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
