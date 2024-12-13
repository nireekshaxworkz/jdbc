package com.xworkz.xworkzAdminDetails.service;

import com.xworkz.xworkzAdminDetails.dto.AdminDetails.AdminDetailsDTO;
import com.xworkz.xworkzAdminDetails.entity.AdminDetailsEntity;
import com.xworkz.xworkzAdminDetails.repository.AdminDetailsRepo;
import com.xworkz.xworkzAdminDetails.repository.AdminDetailsRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDetailsServiceImpl implements AdminDetailsService{
    @Autowired
    private AdminDetailsRepo adminDetailsRepo;
    @Override
    public boolean save(AdminDetailsDTO dto) {
        System.out.println("data in AdminDetailsServiceImpl"+dto);
        String name = dto.getName();
        boolean isValid=false;
        if (!name.isEmpty() && name.length() == 10 && name.matches("[a-zA-Z ]+")) {
            System.out.println("name is valid");
            isValid = true;
        } else {
            isValid = false;
            System.out.println("name is invalid");
        }
        int age = dto.getAge();
        if (age > 18) {
            System.out.println("age is valid");
            isValid = true;
        } else {
            isValid = false;
            System.out.println("age is invalid");
        }
        String email = dto.getEmail();
        if (!email.isEmpty() && email.contains("@") && email.contains("gmail.com"))
        {
            System.out.println("email is valid");
            isValid = true;
        }
        else {
            isValid=false;
            System.out.println("invalid email");
        }
        String password=dto.getPassword();
        int specialCharCount=0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                specialCharCount++;
            }
        }
            if(password!=null && password.length()>=9 && specialCharCount==2)
            {
                System.out.println("valid password");
                isValid = true;
            }
            else {
                isValid=false;
            }
            System.out.println("enter valid password");

        String confirmPassword=dto.getConfirmPassword();
        if(confirmPassword.equals(password)){
            System.out.println("confirm password is same as password");
            isValid = true;
        }
        else{
            isValid=false;
            System.out.println("confirm password is not same  as password ");
        }

        String phoneNumber=dto.getPhone();
        String ph=String.valueOf(phoneNumber);
        if(ph.length()==10){
            System.out.println("phone Number is valid");
            isValid = true;
        }
        else {
            isValid=true;
            System.out.println("phone number is invalid");
        }
       if(isValid) {
           AdminDetailsEntity entity = new AdminDetailsEntity();
           entity.setName(dto.getName());
           entity.setAge(dto.getAge());
           entity.setEmail(dto.getEmail());
           entity.setPassword(dto.getPassword());
           entity.setConfirmPassword(dto.getConfirmPassword());
           entity.setPhone(dto.getPhone());
           System.out.println("service save " + entity);
           System.out.println("Repo service save method" + entity);

           adminDetailsRepo.save(entity);

       }
            return true;
//        }

//        return false;
    }
}
