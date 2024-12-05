package com.xworkz.collageinfo.runner;

import javax.persistence.*;

public class CollageInfoRunner5 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("collageinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("findEmailByPhoneNumber");
        Object object=query.getSingleResult();
        Long long=(Long) object;
        System.out.println("Long:"+long);
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
