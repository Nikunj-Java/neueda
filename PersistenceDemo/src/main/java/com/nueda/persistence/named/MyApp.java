package com.nueda.persistence.named;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import java.util.List;

public class MyApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-jpa-project");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Creating a new entity
            Employee entity = new Employee();
            entity.setName("Nikunj Soni");
            em.persist(entity);

            // Using named query "YourEntityClass.findAll" to retrieve all entities
            List<Employee> allEntities = em.createNamedQuery("Employee.findAll", Employee.class)
                                                  .getResultList();

            System.out.println("All entities:");
            for (Employee e : allEntities) {
                System.out.println("ID: " + e.getId() + ", Name: " + e.getName());
            }

            // Using named query "YourEntityClass.findByName" to filter entities by name
            List<Employee> filteredEntities = em.createNamedQuery("Employee.findByName", Employee.class)
                                                       .setParameter("name", "Nikunj Soni")
                                                       .getResultList();

            System.out.println("\nFiltered entities by name 'Nikunj Soni':");
            for (Employee e : filteredEntities) {
                System.out.println("ID: " + e.getId() + ", Name: " + e.getName());
            }

            // Using named query "YourEntityClass.findTotalCount" to find the total count
            Long totalCount = em.createNamedQuery("Employee.findTotalCount", Long.class)
                                 .setParameter("name", "%Soni%")
                                 .getSingleResult();

            System.out.println("\nTotal count of entities with name containing 'John': " + totalCount);

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
