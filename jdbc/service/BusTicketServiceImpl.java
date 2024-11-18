package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.BusTicketDto;
import com.xworkz.jdbc.repository.BusTicketRepoImpl;

public class BusTicketServiceImpl implements BusTicketService{
    @Override
    public boolean save(BusTicketDto dto) {
        boolean ifValid=true;
        System.out.println("name:"+dto.getName());
        System.out.println("phoneNo:"+dto.getPhoneNo());
        System.out.println("email:"+dto.getEmail());
        System.out.println("age:"+dto.getAge());

        BusTicketRepoImpl busTicketRepo=new BusTicketRepoImpl();
        busTicketRepo.save(dto);

        return false;
    }
}
