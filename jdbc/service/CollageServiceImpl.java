package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.CollageDto;
import com.xworkz.jdbc.repository.CollageRepo;
import com.xworkz.jdbc.repository.CollageRepoImpl;

public class CollageServiceImpl implements CollageService {
    @Override
    public boolean save(CollageDto dto) {
        boolean isValid=true;
        System.out.println("name:"+dto.getName());
        System.out.println("age:"+dto.getAge());
        System.out.println("email:"+dto.getEmail());
        System.out.println("collageName:"+dto.getCollageName());
        System.out.println("stream:"+dto.getStream());
        if(isValid){
            CollageRepoImpl repo=new CollageRepoImpl();
            boolean ref=repo.save(dto);
        }
        return false;
    }
}
