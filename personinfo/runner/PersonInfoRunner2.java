package com.xworkz.personinfo.runner;

import com.xworkz.personinfo.entity.PersonInfoEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class PersonInfoRunner2 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("personinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        Query query=em.createNamedQuery("findEmailByName");
        Object object=query.getSingleResult();
        String string=(String)object;
        System.out.println("String:"+string);
        List<PersonInfoEntity> list=new ArrayList<PersonInfoEntity>();
        list.add(new PersonInfoEntity(1,"Nireeksha","nireeksha055@gmail.com",6364201972l,22));
        list.add(new PersonInfoEntity(2,"Raksha","raksha25@gmail.com",6361285510l,21));
        list.add(new PersonInfoEntity(3,"Rakshitha","lunagowda15@gmail.com",8090892348l,20));
        list.add(new PersonInfoEntity(4,"Nancy","leema189@gmail.com",9876502231l,23));
        list.add(new PersonInfoEntity(5,"Leelavathi","leelagowda16@gmail.com",9720443899l,20));
        list.add(new PersonInfoEntity(6,"UttamSGowda","uttugowda02@gmail.com",8123515866l,6));
        list.add(new PersonInfoEntity(7,"Suma","suma41@gmail.com",6363473642l,42));
        list.add(new PersonInfoEntity(8,"ShivamadeGowda","shivamadu51@gmail.com",9740223172l,51));
        list.add(new PersonInfoEntity(9,"ananya","anugowda20@gmail.com",9901101102l,22));
        list.add(new PersonInfoEntity(10,"vajreshwari","vajra22@gmail.com",8390223172l,20));
        for (PersonInfoEntity studentInfoDTO:list);
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
