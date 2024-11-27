package com.xworkz.runner;

import com.xworkz.dto.GameDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class gameRunner2 {

        public static void main(String[] args) {

            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("hair");
            EntityManager eManager = emFactory.createEntityManager();
            EntityTransaction eTrans = eManager.getTransaction();

            try {
                eTrans.begin();
                Integer id = 9;
                GameDTO dto = new GameDTO();
                GameDTO val = eManager.find(GameDTO.class, id);

                eManager.remove(val);
                eTrans.commit();

            } catch (Exception e) {

                if (eTrans.isActive()) {
                    eTrans.rollback();
                }
                e.printStackTrace();

            } finally {
                eManager.close();
                emFactory.close();
            }

        }

    }

