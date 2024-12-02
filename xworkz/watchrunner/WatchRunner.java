package com.xworkz.watchrunner;

import com.xworkz.watchDTO.WatchDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("confuse");
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction eTrans = em.getTransaction();

        List<WatchDTO> list = new ArrayList<WatchDTO>();
        list.add(new WatchDTO(1,"rolex","chopard",1200));
        list.add(new WatchDTO(2,"cartier","briitling",2600));
        list.add(new WatchDTO(3,"omega","hublot",1370));
        list.add(new WatchDTO(4,"audemarsPguet","tagHeuer",2300));
        list.add(new WatchDTO(5,"patekPhilippe","rolex",1890));
        list.add(new WatchDTO(6,"richardMille","fastTrack",3670));
        list.add(new WatchDTO(7,"longines","sony",2800));
        list.add(new WatchDTO(8,"vacheronConstantin","omegaLuxury",2300));
        for (WatchDTO watchDTO : list) {

            em.persist(watchDTO);
        }

        try {
            eTrans.begin();
            eTrans.commit();

        } catch (Exception e) {
            if(eTrans.isActive()) {
                eTrans.rollback();
            }
        }finally {
            em.close();
            emFactory.close();
        }

    }
}
