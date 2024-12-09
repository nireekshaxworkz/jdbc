package com.xworkz.bankinfo.runner;

import com.xworkz.bankinfo.entity.BankInfoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BankInfoRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        List<BankInfoEntity> list=new ArrayList<BankInfoEntity>();
        list.add(new BankInfoEntity(1,"nireeksha","nireeksha055@gmail.com","6364201972l",22,20));
        list.add(new BankInfoEntity(2,"raksha","raksha@gmail.com","8090898820",21,15));
        list.add(new BankInfoEntity(3,"rakshitha","lunagowda@gmail.com","8123515866",20,25));
        list.add(new BankInfoEntity(4,"nancy","nancyleema@gmail.com","9901101102",23,29));
        list.add(new BankInfoEntity(5,"leelavathi","adminargowda2gmail.com","9855201983",25,16));
        list.add(new BankInfoEntity(6,"ananya","anugowda@gmail.com","8922584790",20,14));
        list.add(new BankInfoEntity(7,"jeevan","jeevugowda@gmail.com","8123515866",24,20));
        list.add(new BankInfoEntity(8,"uttam","uttuSgowda@gmail.com","8977364288",6,2));
        list.add(new BankInfoEntity(9,"shivamadegowda","shivamadu@gmail.com","9740223172",52,1));
        list.add(new BankInfoEntity(10,"suma","nireesuma@gmail.com","6363473642",41,14));
        for (BankInfoEntity bankInfo:list)
            em.persist(list);
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
