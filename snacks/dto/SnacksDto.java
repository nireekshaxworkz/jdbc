package com.xworkz.snacks.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "snacks")
public class SnacksDto {
    @Id
    private int id;
    @Column(name = "snacks_name")
    private String snacksName;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;

    public SnacksDto(int id,String snacksName,double price,int quantity) {
        this.id = id;
        this.snacksName=snacksName;
        this.price=price;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSnacksName() {
        return snacksName;
    }

    public void setSnacksName(String snacksName) {
        this.snacksName = snacksName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SnacksDto() {
        System.out.println("no agr cont..");
    }
}
