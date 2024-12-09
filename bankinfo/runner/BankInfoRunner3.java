package com.xworkz.bankinfo.runner;

import javax.persistence.*;

public class BankInfoRunner3 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query= em.createNamedQuery("updateByPhoneNumberAndAliveAreNot");
        Object object=query.getResultList();
        System.out.println("Object:"+object);
    }
}
