package com.xworkz.shop;

public class Food {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("food class is valid");
        }
    }
}
