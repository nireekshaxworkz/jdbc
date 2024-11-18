package com.xworkz.jdbc2.service;

import com.xworkz.jdbc2.dto.CollageDto;
import com.xworkz.jdbc2.repository.CollageRepoImpl;

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
