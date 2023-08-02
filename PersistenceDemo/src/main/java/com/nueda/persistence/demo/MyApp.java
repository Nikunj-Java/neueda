package com.nueda.persistence.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyApp {
    public static void main(String[] args) {
        // Create an EntityManagerFactory based on the persistence unit defined in persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-jpa-project");

        // Create an EntityManager to interact with the database
        EntityManager em = emf.createEntityManager();
        // Use the EntityManager to perform CRUD operations or queries with JPA

        try {
        	em.getTransaction().begin();
        	User u1= new User();
            u1.setName("Nikunj");
            em.persist(u1);
            em.getTransaction().commit();
            System.out.println("Entity persisted successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        // Close the EntityManager and the EntityManagerFactory when done
        em.close();
        emf.close();
    }
}

