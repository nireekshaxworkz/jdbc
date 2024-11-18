package com.xworkz.jdbc1.service;

import com.xworkz.jdbc1.dto.TripDto;
import com.xworkz.jdbc1.repository.TripRepoImpl;

public class TripServiceImpl implements TripService{
    @Override
    public boolean save(TripDto dto) {
        boolean isValid=true;
        System.out.println("placeName:"+dto.getPlaceName());
        System.out.println("distance:"+dto.getDistance());
        System.out.println("district:"+dto.getDistrict());
        if(isValid){
            System.out.println("saved");
        }else {
            System.out.println("not saved");
        }
        TripRepoImpl tripRepo=new TripRepoImpl();
        tripRepo.save(dto);
        return isValid;
    }
}
