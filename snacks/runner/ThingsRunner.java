package com.xworkz.snacks.runner;

import com.xworkz.snacks.dto.SnacksDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ThingsRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceUnit");
        try {
            EntityManager em= emf.createEntityManager();
            EntityTransaction et= em.getTransaction();
            et.begin();
            em.persist("dtos");
            Integer id = 9;
            SnacksDto dto = new SnacksDto(9,"sandwich",140,80);
            SnacksDto val = em.find(SnacksDto.class, id);
            em.remove(val);
            et.commit();

            } catch (Exception e) {
            if (et.isActive()) {
                    et.rollback();
                }
            e.printStackTrace();
            }finally {
            emf.close();
        }
    }
}
