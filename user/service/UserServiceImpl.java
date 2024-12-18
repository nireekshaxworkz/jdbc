package com.xworkz.user.service;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.entity.UserEntity;
import com.xworkz.user.repository.UserRepository;
import com.xworkz.user.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserEntity entity;
    private String password;

    public char[] passwordGenerate() {
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";


        String values = Capital_chars + Small_chars +
                numbers;


        Random rndm = new Random();

        char[] password = new char[6];

        for (int i = 0; i < 6; i++) {

            password[i] = values.charAt(rndm.nextInt(values.length()));

        }
        return password;
    }

    @Override
    public boolean save(UserDTO dto) {
        System.out.println("using the save in UserServiceImpl");
        UserRepository userRepository=new UserRepositoryImpl();
        userRepository.save(entity);
        boolean isValid = false;
        if (isValid){
            UserEntity entity1=new UserEntity();
            entity1.setId(dto.getId());
            entity1.setName(dto.getName());
            entity1.setEmail(dto.getEmail());
            entity1.setAlternateEmail(dto.getAlternateEmail());
            entity1.setAlternatePhoneNo(dto.getAlternatePhoneNo());
            entity1.setLocation(dto.getLocation());
            System.out.println( "generated password  : "+password);
            
        }
        return true;
    }
}
