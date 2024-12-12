package com.xworkx.travelplace.repository;

import com.xworkx.travelplace.entity.TravelPlaceEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class TravelPlaceRepoImpl implements TravelPlaceRepo{
    @Override
    public boolean save(TravelPlaceEntity entity) {
        System.out.println("running TravelPlaceRepoImpl");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            et.begin();
            em.persist(entity);
            et.commit();
        }catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }finally {
            em.close();
            emf.close();
        }
        return true;
    }
}
