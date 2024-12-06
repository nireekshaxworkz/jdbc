package com.xworkz.personinfo.runner;

import com.xworkz.personinfo.entity.PersonInfoEntity;

import javax.persistence.*;

public class PersonInfoRunner6 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("personinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query= em.createNamedQuery("findPhoneNumberByAge");
        query.setParameter("age",22);
        Object object=query.getSingleResult();
        PersonInfoEntity personInfoEntity=(PersonInfoEntity)object;
        System.out.println("PersonInfoEntity:"+personInfoEntity);
        try {
            et.begin();
            et.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            emf.close();
        }
    }
}