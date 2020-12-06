package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Pacient;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class PacientRepository {
    public Pacient getById(Integer pacientId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Pacient pacient = session.find(Pacient.class, pacientId);
        session.close();
        return pacient;
    }

    public List<Pacient> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from Pacient");

        List<Pacient> listaPacienti = selectAll.list();

        session.close();
        return listaPacienti;
    }
    public void save(Pacient pacient) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(pacient);

        transaction.commit();
        session.close();
    }


    public void update(Pacient pacient) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(pacient);

        transaction.commit();
        session.close();
    }


    public void delete(Pacient pacient) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(pacient);

        transaction.commit();
        session.close();
    }
}
