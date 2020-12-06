package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Angajat;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class AngajatRepository {
    public Angajat getById(Integer angajatId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Angajat angajat = session.find(Angajat.class, angajatId);
        session.close();
        return angajat;
    }

    public List<Angajat> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from Angajat");

        List<Angajat> listaAngajati = selectAll.list();

        session.close();
        return listaAngajati;
    }
    public void save(Angajat angajat) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(angajat);

        transaction.commit();
        session.close();
    }


    public void update(Angajat angajat) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(angajat);

        transaction.commit();
        session.close();
    }


    public void delete(Angajat angajat) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(angajat);

        transaction.commit();
        session.close();
    }



}
