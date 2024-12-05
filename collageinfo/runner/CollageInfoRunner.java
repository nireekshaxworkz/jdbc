package com.xworkz.collageinfo.runner;

import javax.persistence.*;

public class CollageInfoRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("collageinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("findIdByName");
        Object object=query.getSingleResult();
        String string=(String) object;
        System.out.println("String :"+string);
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
