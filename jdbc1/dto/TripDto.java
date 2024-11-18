package com.xworkz.jdbc1.dto;

public class TripDto {
    private String placeName;
    private int distance;
    private String district;

    public TripDto(String placeName,int distance,String district) {
        this.placeName = placeName;
        this.distance=distance;
        this.district=district;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
