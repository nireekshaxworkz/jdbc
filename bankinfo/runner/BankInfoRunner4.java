package com.xworkz.bankinfo.runner;

import javax.persistence.*;

public class BankInfoRunner4 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query= em.createNamedQuery("getAll");
        Object object=query.setParameter("id",8);
        String string=query.getResultList().toString();
        System.out.println("String:"+string);
    }
}
