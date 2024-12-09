package com.xworkz.bankinfo.runner;

import javax.persistence.*;

public class BankInfoRunner5 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("getNameAndEmailById");
        Object object=query.setParameter("id",4);
        String string=query.getSingleResult().toString();
        System.out.println("String:"+string);
    }
}
