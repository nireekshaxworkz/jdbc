package com.xworkz.bankinfo.runner;

import javax.persistence.*;

public class BankInfoRunner8 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("getNameAndEmailAndPhoneNumberById");
        Object object=query.setParameter("id",5);
        int string= query.getFirstResult();
        System.out.println("Object:"+object);
    }
}
