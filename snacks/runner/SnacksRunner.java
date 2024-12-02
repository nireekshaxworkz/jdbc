package com.xworkz.snacks.runner;

import com.xworkz.snacks.dto.SnacksDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SnacksRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceUnit");
        try {
            EntityManager em= emf.createEntityManager();
            EntityTransaction et= em.getTransaction();
            List<SnacksDto>dtos=new ArrayList<SnacksDto>();
            dtos.add(new SnacksDto(1,"chips",50,10));
            dtos.add(new SnacksDto(2,"kurkure",10,15));
            dtos.add(new SnacksDto(3,"chochlate",180,110));
            dtos.add(new SnacksDto(4,"pizza",200,110));
            dtos.add(new SnacksDto(5,"berger",180,100));
            dtos.add(new SnacksDto(6,"frenchFrice",80,20));
            dtos.add(new SnacksDto(7,"paniPuri",35,45));
            dtos.add(new SnacksDto(8,"samosa",50,20));
            dtos.add(new SnacksDto(9,"sandwich",140,80));
            dtos.add(new SnacksDto(10,"pasta",200,120));
            for(SnacksDto snacksDto:dtos);
            SnacksDto dto= new SnacksDto();
            dto.setId(dto.getId());
            dto.setSnacksName(dto.getSnacksName());
            dto.setPrice(dto.getPrice());
            dto.setQuantity(dto.getQuantity());
            for(SnacksDto snacks: dtos) {
                em.persist(snacks);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            emf.close();
        }
    }
}
