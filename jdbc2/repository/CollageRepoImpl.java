package com.xworkz.jdbc2.repository;

import com.xworkz.jdbc2.dto.CollageDto;
import com.xworkz.jdbc2.enumeration.CollageEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CollageRepoImpl implements CollageRepo{
    @Override
    public boolean save(CollageDto dto) {
        boolean ans=false;
        Connection connection= null;
        PreparedStatement prst=null;
        try{
            connection=DriverManager.getConnection(CollegeEnum.URL.getvalue(),CollegeEnu.USERNAME.getvalue(), CollageEnum.PASSWORD.getvalue());
            prst=connection.prepareStatement("insert into Collage_table values("?,?,?,?,?)");
                    prst.setString(1,dto.getName());
                    prst.setString(2,dto.getAge());
                    prst.setString(3,dto.getEmail());
                    prst.setString(4,dto.getCollageName());
                    prst.setString(5,dto.getStream());

                    int value=prst.executeUpdate();
                    if(value>0){
                        ans=true;
                        System.out.println("saved");
                    }
                    else {
                        ans=false;
                        System.out.println("not saved");
                    }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ans;
    }
}
