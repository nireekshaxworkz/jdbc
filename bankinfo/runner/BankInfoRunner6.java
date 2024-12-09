package com.xworkz.bankinfo.runner;

import javax.persistence.*;

public class BankInfoRunner6 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("getCountByEmailAndDate");
        Object object=query.getSingleResult();
        System.out.println("Object:"+object);
    }
}
