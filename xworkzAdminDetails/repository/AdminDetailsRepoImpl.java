package com.xworkz.xworkzAdminDetails.repository;

import com.xworkz.xworkzAdminDetails.entity.AdminDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class AdminDetailsRepoImpl implements AdminDetailsRepo{

    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(AdminDetailsEntity entity) {
        System.out.println(emf);
        EntityManager em= null;
        try {
        em  =  emf.createEntityManager();
        System.out.println(em);
        System.out.println("Repo :"+entity);
        em.getTransaction().begin();
            System.out.println( em.getTransaction().isActive()) ;
            em.persist(entity);
            System.out.println("Db save"+ entity.toString());
            em.getTransaction().commit();
        }catch(Exception e){
             e.printStackTrace();
            }
        finally {
            if(em != null)
                 em.close();
           // emf.close();
        }
        return true;
    }
}
