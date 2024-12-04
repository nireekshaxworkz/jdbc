package com.xworkz.studentinfo.runner;

import javax.persistence.*;

public class StudentInfoRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("getByName");
        Object object=em.getProperties();
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
