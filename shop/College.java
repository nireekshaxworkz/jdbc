package com.xworkz.shop;

public class College {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("college class is valid");
        }
    }
}
