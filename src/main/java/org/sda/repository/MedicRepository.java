package org.sda.repository;

import org.sda.entities.Medic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MedicRepository extends JpaRepository<Medic,Integer> {

    }
