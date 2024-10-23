package com.xworkz.shop;

public class Movie {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("movie class is valid");
        }
    }
}
