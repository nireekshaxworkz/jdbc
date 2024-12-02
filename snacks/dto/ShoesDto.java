package com.xworkz.snacks.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shoes")
public class ShoesDto {
    @Id
    private int Id;
    @Column(name = "shoe_name")
    private String shoeName;
    @Column(name = "color")
    private String color;
    @Column(name = "brand")
    private String brand;
    @Column(name = "price")
    private double price;

    public ShoesDto(int id,String shoeName,String color,String brand,double price) {
        this.Id = id;
        this.shoeName=shoeName;
        this.color=color;
        this.brand=brand;
        this.price=price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ShoesDto() {
        System.out.println("no arg const..");
    }
}
