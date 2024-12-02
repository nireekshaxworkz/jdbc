package com.xworkz.snacks.runner;

import com.xworkz.snacks.dto.ShoesDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ShoesRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceUnit");
        try {
            EntityManager em= emf.createEntityManager();
            EntityTransaction et= em.getTransaction();
            List<ShoesDto> dtos=new ArrayList<ShoesDto>();
            dtos.add(new ShoesDto(1,"boatShoes","black","adidas",500));
            dtos.add(new ShoesDto(2,"chelseaBoots","brown","asics",1000));
            dtos.add(new ShoesDto(3,"loafers","brown","birkenstock",1200));
            dtos.add(new ShoesDto(4,"balletFlats","white","clarks",2000));
            dtos.add(new ShoesDto(5,"espadrilles","blue","fila",3400));
            dtos.add(new ShoesDto(6,"oxford","pink","crocks",2150));
            dtos.add(new ShoesDto(7,"derby","silver","nike",8000));
            dtos.add(new ShoesDto(8,"moccasins","red","puma",3900));
            dtos.add(new ShoesDto(9,"blucher","yellow","redTape",5600));
            dtos.add(new ShoesDto(10,"sandal","brown","bata",3677));
            for (ShoesDto shoesDto:dtos);
            ShoesDto dto = new ShoesDto();
            ShoesDto.setId(dto.getId());
            ShoesDto.setShoeName(dto.getShoeName());
            ShoesDto.setColor(dto.getColor());
            ShoesDto.setBrand(dto.getBrand());
            ShoesDto.setPrice(dto.getPrice());
            for(ShoesDto shoesDto :dtos) {
                em.persist(shoesDto);
            }
        }catch (Exception e){
            if(et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        }finally {
            emf.close();
        }
    }
}
