package com.xworkz.jdbc.person.repository;

import com.xworkz.jdbc.person.dto.PersonDto;
import com.xworkz.jdbc.person.enamuration.PersonEnum;

import java.sql.*;

public class PersonRepoImpl implements PersonRepo{

    @Override
    public boolean save(PersonDto dto) {
        boolean ans=true;
        Connection connection=null;
        PreparedStatement prst=null;
        try {
            connection= DriverManager.getConnection(PersonEnum.URL.getvalue(),PersonEnum.USERNAME.getvalue(),PersonEnum.PASSWORD.getvalue());
            prst=connection.prepareStatement("insert into Person_table value(?,?,?,?,?)");
            prst.setString(1, String.valueOf(dto.getId()));
            prst.setString(2,dto.getName());
            prst.setString(3,dto.getEmail());
            prst.setString(4, String.valueOf(dto.getPhoneNo());
            prst.setString(5,dto.getPassword());
            int value=prst.executeUpdate();
            if(value>0){
                return true;
                System.out.println("saved");
            }else {
                return false;
                System.out.println("not saved");
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return ans;
    }

    @Override
    public boolean getListOfDataById(String dto) {
        boolean ifSaved=false;
        Connection connection=null;
        PreparedStatement prst=null;
        try {
            connection = DriverManager.getConnection(PersonEnum.URL.getvalue(), PersonEnum.USERNAME.getvalue(), PersonEnum.PASSWORD.getvalue());
            prst = connection.prepareStatement("select list from person_table where id=?");
            prst.setString(1, String.valueOf(dto.getId());
            ResultSet resultSet=prst.executeQuery();
            while (resultSet.next()){
                System.out.println("saved");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ifSaved;
    }

    @Override
    public boolean getNameAndEmailById(String name,String email) {
        boolean ifSaved=false;
        Connection connection=null;
        PreparedStatement prst=null;
        String name=null;
        String email=null;
        try {
            connection = DriverManager.getConnection(PersonEnum.URL.getvalue(), PersonEnum.USERNAME.getvalue(), PersonEnum.PASSWORD.getvalue());
            prst = connection.prepareStatement("select name and email from Person_table where id=?");
            prst.setString(1, id);
            ResultSet set = prst.executeQuery();
            while (set.next()) {
                System.out.println("saved");
                return true;
            }
            return ifSaved;
        }catch (SQLException e){
            e.printStackTrace();
        }

    @Override
    public boolean ifEmailAndPasswordSameByData(PersonDto dto) {
            boolean ifSaved=false;
            Connection connection=null;
            PreparedStatement prst=null;
            try {
                connection = DriverManager.getConnection(PersonEnum.URL.getvalue(), PersonEnum.USERNAME.getvalue(), PersonEnum.PASSWORD.getvalue());
                prst = connection.prepareStatement("select email and password from Person_table where data=? ");
                prst.setString(1,dto.getemail());
                prst.setString(2,dto.getPassword());
                ResultSet set = prst.executeQuery();
                while (set.next()) {
                    System.out.println("saved");
                    return true;
                }

            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return ifSaved;
    }

}
