package com.xworkz.collageinfo.runner;

import javax.persistence.*;

public class CollageInfoRunner6 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentInfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query= em.createNamedQuery("findPhoneNumberByAge");
        Object object=query.getSingleResult();
        Integer int=switch ((Integer) Object);
        System.out.println("Integer:"+int);
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
