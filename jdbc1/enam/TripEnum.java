package com.xworkz.jdbc1.enam;

public enum TripEnum {
    URL("jdbc:mysql://localhost:3306/trip"),
    USERNAME("root"),
    PASSWORD("niri@2002");
    private final String result;

    private TripEnum(String result){
        this.result=result;
    }
    public String getvalue(){
        return result;
    }
}
