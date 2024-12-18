package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Autowired
    EntityManagerFactory emf;
    @Override
    public boolean save(UserEntity entity) {
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            et.begin();
            et.commit();
        }catch (Exception e){
            if(et.isActive()){
                et.rollback();
                e.printStackTrace();
            }
        }finally {
            em.close();
            emf.close();
        }
        return true;
    }
}
