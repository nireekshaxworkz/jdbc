package com.xworkz.studentrunner;

import java.sql.*;

import static javax.management.Query.value;


public class StudentRunner {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="nireeksha@2002";
        String quary0="insert into student_table
                value(1,'Nireeksha','nireeksha055@gmail.com','niri@2002','hulahalli',6364201972)";
                    +"(2,'Raksha','raksha127@gmail.com','raksh@157','malavallli',8234509842),"
                    +"(3,'Rakshitha','rakshi195@gmail.com','luna@123','shivamogga',3456208769),"
                    +"(4,'Nancy','leema8412gmail.com','nancy261','sagara',6363473642),"
                    +"(5,'Harshitha','harshi371@gmail.com','harshi320''mandya',,6320809018),"
                    +"(6,'Leelavathi','leela201@gmail.com','leelz21','hassan',8090892379),"
                    +"(7,'Jeevan','jeevan123@gmail.com','jeeva@8090','maddur',8123515866),"
                    +"(8,'Uttam','uttam834@gmail.com','uttu@2018','mandya',9740223172),"
                    +"(9,'Suma','suma256@gmail.com','suma@123','malavalli',6363473642),"
                    +"(10,'Shivamadegowda','shiva123@gmail.com','shiva@345','hulahalli',9740223172),"
                    +"(11,'Neela','neela@gmail.com','neela234','mysore',7089452070),"
                     +"(12,'Gagana','gagana@gmail.com','gagana264','bengalore',9099224689),"
                    +"(13,'Sham','sham@gmail.com','sham290','coorg',8088765430),"
                     +"(14,'Shalini','shalini@gmail.com','shalu24','madikeri'9079890064),"
                    +"(15,'Sunil','sunil@gmail.com','suni234','malavalli',8090892399),"
                    +"(16,'Arpitha','arpitha12@gmail.com','appi123','mandya',8882307478),"
                    +"(17,'Nandha','nandha198@gmail.com','nandha129','mysore',9743503189),"
                    +"(18,'Shruthi','shruthi@gmail.com','shruthi267','malavalli',7890443971),"
                    +"(19,'Ashwini','ashwini@gmail.com','ashwini267','narsipura',7088346799),"
                    +"(20,'Shivu','shivu@gmail.com','shivu287','hulahalli',8880961169),"
        String quary1="(select * from studend_table)";
        String quary2="(select name from student_table where email='nireeksha055@gmail.com'and password='niri@2002')";
        String quary3="(select address from student_table where name='Nireeksha' and phoneNo=6364201972)";
        String quary4="(select email,password from student_table where phoneNo=6364201972)";
        String quary5="(select email,password from student_table where phoneNo=6364201972 and name='Nireeksha')";
        String quary6="(select name from student_table where id>10)";
        String[] quaries={quary0,quary1,quary2,quary3,quary4,quary5,quary6};
        try{
            Connection connection= DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            int value=statement.executeUpdate(quary0);
            if(value>0){
                System.out.println("saved");
            }else {
                System.out.println("not saved");
            }
            for(String quary:quaries){
                System.out.println("exicuting quary:"+quary);
                ResultSet resultSet=statement.executeQuery(quary);
                while(resultSet.next()){
                    if(quary.equals(quary1)){
                        int id=resultSet.getInt("id");
                        String name=resultSet.getString("name");
                        String email=resultSet.getString("email");
                        String password=resultSet.getString("password");
                        String phoneNo=resultSet.getString("phoneNo");
                        System.out.println("Id:"+id,"Name:"+name,"Email:"+email,"Password:"+password,"PhoneNo:"+phoneNo);
                    } else if (quary.equals(quary2)||quary.equals(quary3)) {
                        String name=resultSet.getString("name");
                        String email=resultSet.getString("email");
                        String password=resultSet.getString("password");
                        String phoneNo=resultSet.getString("phoneNo");
                        System.out.println("Name:"+name,"Email:"+email,"Password:"+password,"PhoneNo:"+phoneNo);
                    } else if (quary.equals(quary4)||quary.equals(quary5)) {
                        String name=resultSet.getString("name");
                        String email=resultSet.getString("email");
                        String password=resultSet.getString("password");
                        String phoneNo=resultSet.getString("phoneNo");
                        System.out.println("Name:"+name,"Email:"+email,"Password:"+password,"PhoneNo:"+phoneNo);
                    }
                }
                System.out.println("quary exicute successfully./n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
