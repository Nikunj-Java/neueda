package com.nueda.persistence.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ExtractingData {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-jpa-project");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // JPQL query to select all entities of type YourEntityClass
            List<User> entities = em.createQuery("FROM User").getResultList();
            for (User entity : entities) {
                System.out.println("ID: " + entity.getId() + ", Name: " + entity.getName());
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
