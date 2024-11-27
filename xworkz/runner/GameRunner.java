package com.xworkz.runner;

import com.xworkz.dto.GameDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GameRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceUnit");
        try {
            EntityManager em=emf.createEntityManager();
            EntityTransaction et=em.getTransaction();
            et.begin();
            GameDTO dto=new GameDTO(1,"chess",2,"castling","uttam");
            GameDTO dto1=new GameDTO(2,"kabbadi",7,"tossing","nireeksha");
            GameDTO dto2=new GameDTO(3,"volleyball",6,"rallying","suma");
            GameDTO dto3=new GameDTO(4,"throwball",11,"serving","nancy");
            GameDTO dto4=new GameDTO(5,"cricket",11,"pitch","jeevan");
            GameDTO dto5=new GameDTO(6,"koko",12,"playingArea","nancy");
            GameDTO dto6=new GameDTO(7,"badminton",2,"net","megha");
            GameDTO dto7=new GameDTO(8,"tableTannis",2,"volleys","raksha");
            GameDTO dto8=new GameDTO(9,"hockey",8,"fieldHockey","rakshitha");
            GameDTO dto9=new GameDTO(10,"football",11,"fairCatch","leela");
            em.persist("dto");
            et.commit();
        }catch (Exception e){
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        }
        finally {
            emf.close();
        }
    }
}
