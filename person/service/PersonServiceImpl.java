package com.xworkz.jdbc.person.service;

import com.xworkz.jdbc.person.dto.PersonDto;
import com.xworkz.jdbc.person.repository.PersonRepoImpl;

public class PersonServiceImpl implements PersonService{
    @Override
    public boolean save(PersonDto dto) {
        boolean isValid=true;
        System.out.println("id:"+dto.getId());
        System.out.println("name:"+dto.getName());
        System.out.println("email:"+dto.getEmail());
        System.out.println("phoneNo:"+dto.getPhoneNo());
        System.out.println("password:"+dto.getPassword());

        PersonRepoImpl personRepo=new PersonRepoImpl();
        personRepo.save(dto);
        return isValid;
    }

    @Override
    public boolean getListOfDataById(String data) {
        boolean isValid=true;
        if(data!=null){
            System.out.println("data is matched");
        }else {
            System.err.println("data is not matched");
        }
        return isValid;
        PersonRepoImpl personRepo=new PersonRepoImpl();
        personRepo.getListOfDataById(data);
    }

    @Override
    public boolean getNameAndEmailById(String name, String email) {
        boolean isValid=true;
        if(name!=null){
            System.out.println("data is matched");
        }else {
            System.err.println("data is not matched");
        }
        return isValid;
        PersonRepoImpl personRepo=new PersonRepoImpl();
        personRepo.getNameAndEmailById(name);

        if(email!=null){
            System.out.println("data is matched");
        }else {
            System.err.println("data is not matched");
        }
        return isValid;
        PersonRepoImpl personRepo=new PersonRepoImpl();
        personRepo.getNameAndEmailById(email);
    }

    @Override
    public boolean ifEmailAndPasswordSameByData(PersonDto dto) {
        if(email!=null){
            System.out.println("data is matched");
        }else {
            System.err.println("data is not matched");
        }
        return isValid;
        PersonRepoImpl personRepo=new PersonRepoImpl();
        personRepo.ifEmailAndPasswordSameByData(dto);
    }
    if(password!=null){
        System.out.println("data is matched");
    }else {
        System.err.println("data is not matched");
    }
        return isValid;
    PersonRepoImpl personRepo=new PersonRepoImpl();
    personRepo.ifEmailAndPasswordSameByData(dto);
}
