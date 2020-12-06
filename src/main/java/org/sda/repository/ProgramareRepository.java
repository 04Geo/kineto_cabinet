package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Programare;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class ProgramareRepository {
    public Programare getById(Integer programareId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Programare programare = session.find(Programare.class, programareId);
        session.close();
        return programare;
    }

    public List<Programare> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from Programare");

        List<Programare> listaProgramari = selectAll.list();

        session.close();
        return listaProgramari;
    }
    public void save(Programare programare) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(programare);

        transaction.commit();
        session.close();
    }


    public void update(Programare programare) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(programare);

        transaction.commit();
        session.close();
    }


    public void delete(Programare programare) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(programare);

        transaction.commit();
        session.close();
    }
}
