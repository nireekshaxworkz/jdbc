package com.xworkz.shop;

public class Snacks {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("snacks class is valid");
        }
    }
}
