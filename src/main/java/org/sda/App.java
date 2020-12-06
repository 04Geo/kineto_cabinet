package org.sda;

import org.sda.entities.*;
import org.sda.repository.*;
import org.sda.service.ManagementCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }
    @Autowired
    AngajatRepository angajatRepository;

    @Autowired
    AbonamentRepository abonamentRepository;

    @Autowired
    DiagnosticRepository diagnosticRepository;

    @Override
    public void run(String... args) throws Exception {
        for(Diagnostic d: diagnosticRepository.findAll()){
            System.out.println(d.getDiagnostic());
        }


    }
}
