package com.xworkz.snacks;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.sql.*;

public class SnacksRunner {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/snacks";
        String user="root";
        String password="nireeksha@2002";
        String quary1="insert into Snacks
        +"(01,'Cake','50Rs'),"
        +"(02,'potatoChips', '80Rs'),"
        +"(03,'trailMix', '45Rs'),"
        +"(04,'Banana', '30Rs'),"
        +"(05,'Browmies','90Rs'),"
        +"(06,'Cheese','110Rs'),"
        +"(07,'Popcorn','40Rs'),"
        +"(08,'Almond','180Rs'),"
        +"(09,'Apple','140Rs'),"
        +"(10,'BeerNuts','280Rs'),"
        +"(11,'Butter','200Rs'),"
        +"(12,'Cookies','140Rs'),";
        String quary2="select * from Snacks_table";
        String quary3="select id from Snacks_table where name='cake' and price='50Rs'";
        String[] quaries={quary1,quary2,quary3};
        Connection connection=null;
        try {
            {
                connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                int value = statement.executeUpdate(quary1);
                if (value > 0) {
                    System.out.println("saved");
                } else {
                    System.out.println("not saved");
                }
                for(String quary :quaries){
                    System.out.println("exicute quary");
                    ResultSet resultSet=statement.executeQuery(quary);
                    while (resultSet.next()){
                        if(quary.equals(quary1)||quary.equals(quary2)||quary.equals(quary3)){
                            int id=resultSet.getInt("id");
                            String name=resultSet.getString("name");
                            String price=resultSet.getString("price");
                            System.out.println("Id:"+id,"Name:"+name,"Price:"+price);
                        }
                    }
                    System.out.println("quary exicute successfully");
                }

            }
            catch(SQLException e){
                e.StackTrace;
            }
        }}

