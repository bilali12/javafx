package com.isi.bibliotheque.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DAO {
    private  static DAO instance;
    private EntityManager entityManager;

    public static DAO getInstance() {
        if(instance == null) { instance = new DAO(); }
        return instance;
    }

    public DAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bibliothequePU");
        if(entityManager == null) { entityManager = entityManagerFactory.createEntityManager();}
        return entityManager;
    }

    public void persist(Book book) {

        try{
            entityManager.getTransaction().begin();
            entityManager.persist(book);
        }catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

    public void merge(Book book) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(book);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
        }
    }

    public void closeEntityManager(){
        entityManager.close();
    }
}
