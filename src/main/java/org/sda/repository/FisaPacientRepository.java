package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.FisaPacient;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class FisaPacientRepository {
    public FisaPacient getById(Integer fisaId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        FisaPacient fisa = session.find(FisaPacient.class, fisaId);
        session.close();
        return fisa;
    }

    public List<FisaPacient> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from FisaPacient");

        List<FisaPacient> fisePacienti = selectAll.list();

        session.close();
        return fisePacienti;
    }
    public void save(FisaPacient fisaPacient) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(fisaPacient);

        transaction.commit();
        session.close();
    }


    public void update(FisaPacient fisaPacient) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(fisaPacient);

        transaction.commit();
        session.close();
    }


    public void delete(FisaPacient fisaPacient) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(fisaPacient);

        transaction.commit();
        session.close();
    }

    public List<FisaPacient> getAllByPacientId(Integer pacientId){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAllFiseByPacientid =
                session.createQuery("from FisaPacent f WHERE f.pacient.id = :pacientCautat");
        selectAllFiseByPacientid.setParameter("pacientCautat",pacientId);

        List<FisaPacient> inregistrariFise = selectAllFiseByPacientid.list();

        session.close();
        return inregistrariFise;
    }
}
