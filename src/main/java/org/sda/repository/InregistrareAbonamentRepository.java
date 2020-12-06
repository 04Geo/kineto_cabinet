package org.sda.repository;

import org.sda.entities.InregistrareAbonament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface InregistrareAbonamentRepository extends JpaRepository<InregistrareAbonament,Integer> {


    @Query("FROM InregistrareAbonament s WHERE s.pacient.id= :pacientId")
    List<InregistrareAbonament> getAllByPacientId(@Param("pacientId") Integer id);
}
