package com.xworkx.travelplace.controller;

import com.xworkx.travelplace.dto.TravelPlaceDTO;
import com.xworkx.travelplace.service.TravelPlaceService;
import com.xworkx.travelplace.service.TravelPlaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TravelPlaceController {
    @Autowired
    private TravelPlaceService travelPlaceService;
    public TravelPlaceController() {
        System.out.println("creating no arg TravelPlaceController");
    }
    @RequestMapping("/save")
    public String onSave(TravelPlaceDTO dto){
        System.out.println("onSaving TravelPlaceController");
        return "index.jsp";
        TravelPlaceService travelPlaceService=new TravelPlaceServiceImpl();
        travelPlaceService.save(dto);
    }
}
