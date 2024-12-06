package com.xworkz.personinfo.runner;

import javax.persistence.*;

public class PersonInfoRunner4 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("personinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("findnameByEmail");
        Object object=query.getSingleResult();
        String string=(String) object;
        System.out.println("String:"+string);
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
