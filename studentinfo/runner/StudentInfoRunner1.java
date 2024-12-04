package com.xworkz.studentinfo.runner;

import com.xworkz.studentinfo.dto.StudentInfoDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class StudentInfoRunner1 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentinfo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        List<StudentInfoDTO> list=new ArrayList<StudentInfoDTO>();
        for (StudentInfoDTO studentInfoDTO:list);
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
