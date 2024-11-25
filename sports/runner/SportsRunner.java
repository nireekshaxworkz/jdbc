package com.xworkz.sports.runner;

import com.sun.org.apache.xerces.internal.impl.XMLEntityManager;
import com.xworkz.sports.dto.SportsDTO;

import javax.swing.text.html.parser.Entity;

public class SportsRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF=Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=eMF.createEntityManager();
        EntityTransaction eT=entityManager.getTransaction();
        try {
            eT.begins;
            SportsDTO sp=new SportsDTO();
            sp.setId(1);
            sp.setSportsName("kabbadi");
            sp.setPlayers(11);
            sp.setInventer("sundarRamu");
            sp.setRules("playersMustBe7");
            eM.commit;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            entityManager.close;
            eMF.close;
        }
    }
}
