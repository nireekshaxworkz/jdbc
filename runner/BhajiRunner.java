package com.xworkz.jdbc.runner;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.sql.*;

public class BhajiRunner {
    String url="jdbc:mysql://localHost:3306/jdbc";
    String userName="root";
    String password="niri@2002";
    String quary1="insert into Bhaji_table(01,'AlooBhaji','150Rs') ";
    String quary2="insert into Bhaji_table(02,'PyazBhaji','200Rs')";
    String quary3="insert into Bhaji_table(03,'GobhiBhaji','180Rs')";
    String quary4="insert into Bhaji_table(04,'CheeseBhaji','150Rs')";
    String quary5="insert into Bhaji_table(05,'GajarBhaji','100Rs')";
    String quary6="insert into Bhaji_table(06,'BeetBhaji','200Rs')";
    String quary7="insert into Bhaji_table(07,'PalakBhaji','100Rs')";
    String quary8="insert into Bhaji_table(08,'TamatarBhaji','180Rs')";
    String quary9="insert into Bhaji_table(09,'BrinjalBhaji','120Rs')";
    String quary10="insert into Bhaji_table(10,'MushroomBhaji','300Rs')";
    String quary11="insert into Bhaji_table(11,'VadaPavBhaji','80Rs')";
    String quary12="insert into Bhaji_table(12,'PatticeBhaji','120Rs')";
    String quary13="insert into Bhaji_table(13,'RagdaPatticeBhaji','123Rs')";
    String quary14="insert into Bhaji-table(14,'DahiVadaPhaji','230Rs')";
    String quary15="insert into Bhaji_table(15,'MisalPavBhaji','180Rs')";
    String quary16="insert into Bhaji_table(16,'GathiyaBhaji','250Rs')";
    String quary17="insert into Bhaji_table(17,'DhoklaBhaji','190Rs')";
    String quary18="insert into Bhaji_table(18,'PkoraBhaji','280Rs')";
    String quary19="insert into Bhaji_table(19,'VadaiBhaji','150Rs')";
    String quary20="insert into Bhaji_table(20,'BondaBhaji','200Rs')";

    public static void main(String[] args) {
        Connection connection=null;
        try {
            connection= DriverManager.getConnection(url,userName,password);
            if(connection!=null){
                System.out.println("connection get connected");
                }
            else {
                System.out.println("connection not connected");
            }
            Statement statement=connection.createStatement();
            value = statement.executeUpdate("quary");
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
