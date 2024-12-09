package com.xworkz.bankinfo.runner;

import com.xworkz.bankinfo.entity.BankInfoEntity;

import javax.persistence.*;
import java.util.List;

public class BankInfoRunner2 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query= em.createNamedQuery("updateByEmailAndPhoneNumber");
        int value=query.executeUpdate();
        if(value>0){
            System.out.println("updated");
        }else {
            System.out.println("not updated");
        }
    }
}
