package com.xworkx.travelplace.service;

import com.xworkx.travelplace.dto.TravelPlaceDTO;
import com.xworkx.travelplace.entity.TravelPlaceEntity;
import com.xworkx.travelplace.repository.TravelPlaceRepo;
import com.xworkx.travelplace.repository.TravelPlaceRepoImpl;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
public class TravelPlaceServiceImpl implements TravelPlaceService{
    @Override
    public boolean save(TravelPlaceDTO dto) {
        System.out.println("running travelPlaceServiceImpl");
        int setId=dto.getId();
        String setPlaceName=dto.getPlaceName();
        int setPincode=dto.getPincode();

        TravelPlaceRepo travelPlaceRepo=new TravelPlaceRepoImpl();
        travelPlaceRepo.save(entity);
        return true;
    }
}
