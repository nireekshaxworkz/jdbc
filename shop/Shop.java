package com.xworkz.shop;

public class Shop {
    public static void main(String[] args) {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
       }
       catch (ClassNotFoundException e){
           System.out.println("shop class is valid");
       }
    }
}
