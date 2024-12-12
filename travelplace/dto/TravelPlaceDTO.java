package com.xworkx.travelplace.dto;

public class TravelPlaceDTO {
    private int id;
    private String placeName;
    private int pincode;

    public TravelPlaceDTO(int id, String placeName, int pincode) {
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

    public TravelPlaceDTO() {
        System.out.println("no arg travelPlaceDto constructor");
    }
}
