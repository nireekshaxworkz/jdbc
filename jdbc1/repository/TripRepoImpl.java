package com.xworkz.jdbc1.repository;

import com.xworkz.jdbc1.dto.TripDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TripRepoImpl implements TripRepo{
    @Override
    public boolean save(TripDto dto) {
        boolean ans=false;
        Connection connection=null;
        PreparedStatement prst=null;
        try {
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch(ClassNotFoundException e1);
            e1.printStackTrace();
        }

        try {
            connection= DriverManager.getConnection(TripEnum.URL.getvalue(),TripEnum.USERNAME.getvalue(),TripEnum.PASSWORD.getvalu());
            prst=connection.prepareStatement("insert into Trip_table value(?,?,?)");
            prst.setString(1,dto.getPlaceName);
            prst.setString(2,dto.getDistance);
            prst.setString(3,dto.getdistrict);

            int value= prst.executeUpdate();
            if(value>0){
                return  true;
                System.out.println("saved");
            }else {
                return  false;
                System.out.println("not saved");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ans;
    }
}
