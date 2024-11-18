package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.BusTicketDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusTicketRepoImpl implements BusTicketRepo{
    @Override
    public boolean save(BusTicketDto dto) {
        boolean ans=true;
        Connection connection=null;
        PreparedStatement prst=null;
        try {
            connection= DriverManager.getConnection(BusTicketEnum.URL.getvalue(),BusTicketEnum.USERNAME.getvalue(),BusTicketEnum.PASSWORD.getvalue());
            prst=connection.prepareStatement("insert into BusTicket_table value(?,?,?,?)");
            prst.setString(1,dto.getName);
            prst.setString(2,dto.getphoneNo);
            prst.setString(3,dto.getemail);
            prst.setString(4,dto.getAge);
            int value=prst.executeUpdate();
            if(value>0){
                return true;
                System.out.println("saved");
            }else {
                return false;
                System.out.println("not saved");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ans;
    }
}
