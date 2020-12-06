package org.sda.repository;

import org.sda.entities.Diagnostic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DiagnosticRepository extends JpaRepository<Diagnostic,Integer> {

}
