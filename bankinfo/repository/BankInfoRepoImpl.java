package com.xworkz.bankinfo.repository;

import com.xworkz.bankinfo.entity.BankInfoEntity;

import javax.persistence.*;

public class BankInfoRepoImpl implements BankInfoRepo{
    @Override
    public boolean save(BankInfoEntity entity) {
        System.out.println("running BankInfoRepoImpl");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("deleteTheRowsWhereNameAndAge");
        int value=query.executeUpdate();
        if(value>0){
            System.out.println("saved");
        }else {
            System.out.println("not saved");
        }
        try {
            et.begin();
            et.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            emf.close();
        }
        return true;
    }
}
