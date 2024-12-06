package com.xworkz.personinfo.runner;

import com.xworkz.personinfo.entity.PersonInfoEntity;

import javax.persistence.*;

public class PersonInfoRunner5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("collageinfo");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Query query = em.createNamedQuery("findEmailByPhoneNumber");
        query.setParameter("phoneNumber",6364201972l);
        Object object = query.getSingleResult();
        PersonInfoEntity personInfoEntity=(PersonInfoEntity)object;
        System.out.println("PersonInfoEntity:" + personInfoEntity);
        try {
            et.begin();
            et.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
