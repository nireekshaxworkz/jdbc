package com.xworkz.jdbc.enumeration;

public class CollageEnum {

    URL("jdbc:mysql://localhost:3306/collage"),
    USERNAME("root"),
    PASSWORD("niri@2002");

    private final String result;

    private CollageEnum(String result){
        this.result=result;
    }
    public String getvalue(){
        return result;
    }


}
