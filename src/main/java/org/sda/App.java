package org.sda;

import org.sda.entities.*;
import org.sda.repository.*;
import org.sda.service.ManagementCabinetService;

import java.util.List;

public class App {

    public static void main(String[] args) {

        SpecializareRepository specializareRepository = new SpecializareRepository();
        AngajatRepository angajatRepository = new AngajatRepository();
        MedicRepository medicRepository = new MedicRepository();
        PacientRepository pacientRepository = new PacientRepository();
        AbonamentRepository abonamentRepository = new AbonamentRepository();
        ManagementCabinetService managementCabinetService=new ManagementCabinetService();
        DiagnosticRepository diagnosticRepository = new DiagnosticRepository();


        Specializare specializareNoua = new Specializare("kinetoterapie");
//        specializareRepository.save(specializareNoua);
        List<Specializare> specializari =  specializareRepository.getAll();


        Angajat angajatNou = new Angajat("1880202222222","Cozma","George", "0722222222","george@email.com",specializari);
//        angajatRepository.save(angajatNou);
        System.out.println(angajatRepository.getAll());


        Medic medicNou = new Medic("Cozma", "Victor", "Neuropediatru","0720000000","dr.victor@email.com");
//        medicRepository.save(medicNou);
        System.out.println(medicRepository.getAll());


        Pacient pacientNou = new Pacient("1601021333333","Cozma","Radu","0733333333",null);
//        pacientRepository.save(pacientNou);
        System.out.println(pacientRepository.getAll());

        Abonament abonamentNou = new Abonament(10,"500",30);
//        abonamentRepository.save(abonamentNou);
        System.out.println(abonamentRepository.getAll());

//        managementCabinetService.saveRegistruAbonamente(pacientRepository.getById(1),abonamentRepository.getById(1));

        System.out.println(diagnosticRepository.getAll());
    }
}
