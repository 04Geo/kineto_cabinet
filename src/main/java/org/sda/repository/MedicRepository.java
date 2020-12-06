package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Medic;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class MedicRepository {
    public Medic getById(Integer medicId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Medic medic = session.find(Medic.class, medicId);
        session.close();
        return medic;
    }

    public List<Medic> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from Medic");

        List<Medic> listaMedici= selectAll.list();

        session.close();
        return listaMedici;
    }
    public void save(Medic medic) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(medic);

        transaction.commit();
        session.close();
    }


    public void update(Medic medic) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(medic);

        transaction.commit();
        session.close();
    }


    public void delete(Medic medic) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(medic);

        transaction.commit();
        session.close();
    }
}
