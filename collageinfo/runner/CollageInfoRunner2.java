package com.xworkz.collageinfo.runner;

import com.xworkz.collageinfo.entity.CollageInfoEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class CollageInfoRunner2 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("collageinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("findEmailByName");
        Object object=query.getSingleResult();
        String string=(String)object;
        System.out.println("String:"+string);
        List<CollageInfoEntity> list=new ArrayList<CollageInfoEntity>();
        list.add(new CollageInfoEntity(1,"Nireeksha","nireeksha055@gmail.com",6364201972l,22));
        list.add(new CollageInfoEntity(2,"Raksha","raksha25@gmail.com",6361285510l,21));
        list.add(new CollageInfoEntity(3,"Rakshitha","lunagowda15@gmail.com",8090892348l,20));
        list.add(new CollageInfoEntity(4,"Nancy","leema189@gmail.com",9876502231l,23));
        list.add(new CollageInfoEntity(5,"Leelavathi","leelagowda16@gmail.com",9720443899l,20));
        list.add(new CollageInfoEntity(6,"UttamSGowda","uttugowda02@gmail.com",8123515866l,6));
        list.add(new CollageInfoEntity(7,"Suma","suma41@gmail.com",6363473642l,42));
        list.add(new CollageInfoEntity(8,"ShivamadeGowda","shivamadu51@gmail.com",9740223172l,51));
        list.add(new CollageInfoEntity(9,"ananya","anugowda20@gmail.com",9901101102l,22));
        list.add(new CollageInfoEntity(10,"vajreshwari","vajra22@gmail.com",8390223172l,20));
        for (CollageInfoEntity studentInfoDTO:list);
        try {
            et.begin();
            et.commit();
            if(et.isActive()){
                et.rollback();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            emf.close();
        }
    }
}
