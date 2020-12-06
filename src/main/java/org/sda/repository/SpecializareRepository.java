package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Specializare;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class SpecializareRepository {
    public Specializare getById(Integer specializareId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Specializare specializare = session.find(Specializare.class, specializareId);
        session.close();
        return specializare;
    }

    public List<Specializare> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from Specializare");

        List<Specializare> specializari = selectAll.list();

        session.close();
        return specializari;
    }
    public void save(Specializare specializare) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(specializare);

        transaction.commit();
        session.close();
    }


    public void update(Specializare specializare) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(specializare);

        transaction.commit();
        session.close();
    }


    public void delete(Specializare specializare) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(specializare);

        transaction.commit();
        session.close();
    }



}
