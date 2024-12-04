package com.xworkz.studentinfo.runner;

import com.xworkz.studentinfo.dto.StudentInfoDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class StudentInfoRunner2 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentinfo");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            et.begin();
            List<String> email=em.createQuery("select cd.email from StudentInfoDTO cd where cd.name like:pat1 or cd.name like:pat2",
                            String.class)
                    .setParameter("pat1","S%").
                    setParameter("pat2","N%").
                    getResultList();
            for (String emails:email){
                System.out.println(email);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            emf.close();
        }
    }
}
