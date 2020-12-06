package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Abonament;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class AbonamentRepository {

    public Abonament getById(Integer abonamentId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Abonament abonament = session.find(Abonament.class, abonamentId);
        session.close();
        return abonament;
    }

    public List<Abonament> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from Abonament");

        List<Abonament> listaAbonamente = selectAll.list();

        session.close();
        return listaAbonamente;
    }
    public void save(Abonament abonament) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(abonament);

        transaction.commit();
        session.close();
    }


    public void update(Abonament abonament) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(abonament);

        transaction.commit();
        session.close();
    }


    public void delete(Abonament abonament) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(abonament);

        transaction.commit();
        session.close();
    }

    public Abonament getTipAbonament(String tipAbonament) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Abonament abonament = session.find(Abonament.class, tipAbonament);
        session.close();
        return abonament;
    }


}
