package org.sda.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.entities.Diagnostic;
import org.sda.entities.Programare;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProgramareRepository extends JpaRepository<Programare,Integer> {

}
