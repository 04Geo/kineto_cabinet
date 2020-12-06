package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Diagnostic;
import org.sda.utils.HibernateUtils;

import java.util.List;

public class DiagnosticRepository {
    public Diagnostic getById(Integer diagnosticId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Diagnostic diagnostic = session.find(Diagnostic.class, diagnosticId);
        session.close();
        return diagnostic;
    }

    public List<Diagnostic> getAll(){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Query selectAll = session.createQuery("from Diagnostic");

        List<Diagnostic> listaDiagnostice = selectAll.list();

        session.close();
        return listaDiagnostice;
    }
    public void save(Diagnostic diagnostic) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(diagnostic);

        transaction.commit();
        session.close();
    }


    public void update(Diagnostic diagnostic) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(diagnostic);

        transaction.commit();
        session.close();
    }


    public void delete(Diagnostic diagnostic) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(diagnostic);

        transaction.commit();
        session.close();
    }
}
