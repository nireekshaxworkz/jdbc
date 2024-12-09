package com.xworkz.bankinfo.runner;

import javax.persistence.*;

public class BankInfoRunner7 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("getCountBywhereAge>15");
        Object object=query.setParameter("age",6);
        int string=query.getFirstResult();
        System.out.println("Object:"+object);
    }
}
