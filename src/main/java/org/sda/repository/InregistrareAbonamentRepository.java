package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.InregistrareAbonament;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class InregistrareAbonamentRepository {
    public InregistrareAbonament getById(Integer inregistrareAbonamentId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        InregistrareAbonament abonament = session.find(InregistrareAbonament.class, inregistrareAbonamentId);
        session.close();
        return abonament;
    }

    public List<InregistrareAbonament> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from InregistrareAbonament");

        List<InregistrareAbonament> inregistrariAbonamente = selectAll.list();

        session.close();
        return inregistrariAbonamente;
    }
    public void save(InregistrareAbonament inregistrareAbonament) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(inregistrareAbonament);

        transaction.commit();
        session.close();
    }


    public void update(InregistrareAbonament inregistrareAbonament) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(inregistrareAbonament);

        transaction.commit();
        session.close();
    }


    public void delete(InregistrareAbonament inregistrareAbonament) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(inregistrareAbonament);

        transaction.commit();
        session.close();
    }

    public List<InregistrareAbonament> getAllByPacientId(Integer pacientId){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAllAbonamenteByPacientid =
                session.createQuery("from InregistrareAbonament i WHERE i.pacient.id = :pacientCautat");
        selectAllAbonamenteByPacientid.setParameter("pacientCautat",pacientId);

        List<InregistrareAbonament> inregistrariAbonamente = selectAllAbonamenteByPacientid.list();

        session.close();
        return inregistrariAbonamente;
    }
}
