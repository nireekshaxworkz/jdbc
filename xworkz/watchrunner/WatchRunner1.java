package com.xworkz.watchrunner;

import com.xworkz.watchDTO.WatchDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class WatchRunner1 {
    public static void main(String[] args) {

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("confuse");
        EntityManager eManager = emFactory.createEntityManager();
        EntityTransaction eTrans = eManager.getTransaction();

        List<WatchDTO> list = eManager.createQuery("select cd.name, cd.phoneNo from ConfusingDto cd where cd.age >15", WatchDTO.class)
                .getResultList();

        for(WatchDTO dto: list) {
            System.out.println("ConfusingDto = "+ dto.getName() + ", "+ dto.getBrand());
        }

        try {
            eTrans.begin();
            eTrans.commit();

        } catch (Exception e) {
            if(eTrans.isActive()) {
                eTrans.rollback();
            }
        }finally {
            emFactory.close();
            eManager.close();
        }
    }

}
