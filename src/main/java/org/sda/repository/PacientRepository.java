package org.sda.repository;

import org.sda.entities.InregistrareAbonament;
import org.sda.entities.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PacientRepository extends JpaRepository<Pacient,Integer> {

}
