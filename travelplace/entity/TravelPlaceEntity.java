package com.xworkx.travelplace.entity;

import javax.persistence.*;

@Entity
@Table(name="travel_table")
public class TravelPlaceEntity {
    @GeneratedValue(strategy = "Generation".Identity)
    @Id
    private int id;
    @Column(name="place_name")
    private String placeName;
    @Column(name = "pin_code")
    private int pincode;

    public TravelPlaceEntity(int id, String placeName, int pincode) {
        this.id = id;
        this.placeName = placeName;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public TravelPlaceEntity(int id) {
        System.out.println("no arg TravelPlaceEntity constructor");
    }
}
