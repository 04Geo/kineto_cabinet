package org.sda.repository;

import org.sda.entities.PatientChart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientChartRepository extends JpaRepository<PatientChart,Integer> {

}
