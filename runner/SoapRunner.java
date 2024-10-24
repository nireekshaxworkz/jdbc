package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SoapRunner {
    String url="jdbc:mysql://localHost:3306/jdbc";
    String userName="root";
    String password="niri@2002";
    String quary1="insert into Soap_table(01,'Dovesoap','180Rs','one')";
    String quary2="insert into Soap_table(02,'SandalSoap','80Rs','two')";
    String quary3="insert into Soap_table(03,'LUXSoap','40Rs','one')";
    String quary4="insert into Soap_table(04,'Santoor','80Rs','two')";
    String quary5="insert into Soap_table(05,'PearSoap','120Rs','three')";
    String quary6="insert into Soap_table(06,'MedimixSoap','200Rs','five')";
    String quary7="insert into Soap_table(07,'ITCSoap','190Rs','eight')";
    String quary8="insert into Soap_table(08,'SwatiSoap','280Rs','six')";
    String quary9="insert into Soap_table(09,'Biotique','200Rs','five')";
    String quary10="insert into Soap_table(10,'FaimaSoap','230Rs','seven')";
    String quary11="insert into Soap_table(11,'LifebuoySoap','40Rs','four')";
    String quary12="insert into Soap_table(12.'NiveaSoap','120Rs','three')";
    String quary13="insert into Soap_table(13,'HamamSoap','203Rs','one')";
    String quary14="insert into Soap_table(14,'SantoorSoap','120Rs','nine')";
    String quary15="insert into Soap_table(15,'HimalayaSoap','170Rs','ten')";
    String quary16="insert into Soap_table(16'KavitSoap','109Rs','eleven')";
    String quary17="insert into Soap_table(17,'MahavirSoap','230Rs','five')";
    String quary18="insert into Soap_table(18,'BiecheleSoap','300Rs','seven')";
    String quary19="insert into Soap_table(19,'TetmosolSoap','200Rs','eight')";
    String quary20="insert into Soap_table(20,'MargoSoap','280Rs','six')";

    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection= DriverManager.getConnection(url,userName,password);
            if(connection!=null){
                System.out.println("connection is connected");
            }
            else {
                System.out.println("connection is not connected");
            }
            Statement statement=connection.createStatement();
            value=statement.executeUpdate("quary");
            if(value>0){
                System.out.println("saved");
            }
            else {
                System.out.println("not saved");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
