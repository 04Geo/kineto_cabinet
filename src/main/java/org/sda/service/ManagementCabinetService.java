package org.sda.service;

import org.sda.entities.*;
import org.sda.repository.FisaPacientRepository;
import org.sda.repository.InregistrareAbonamentRepository;
import org.sda.repository.PacientRepository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

public class ManagementCabinetService {
    InregistrareAbonamentRepository inregistrareAbonamentRepository = new InregistrareAbonamentRepository();
    PacientRepository pacientRepository = new PacientRepository();
    FisaPacientRepository fisaPacient = new FisaPacientRepository();


    //    metoda de inregistrare abonament (Client,Tip abonament)
    public void saveRegistruAbonamente(Pacient pacient, Abonament abonament) {
        if (pacientRepository.getById(pacient.getId()) == null) {
            throw new RuntimeException(("Pacientul nu este inregistrat!"));
        }

        List<InregistrareAbonament> inregistrariAbonamente = inregistrareAbonamentRepository.getAllByPacientId(pacient.getId());
        LocalDate now =LocalDate.now();
        Timestamp nowTimestamp =Timestamp.valueOf(now.plusDays(abonament.getValabilitateAbonament()).atStartOfDay());

        for (InregistrareAbonament inregistrare:inregistrariAbonamente)

            if(inregistrariAbonamente.size()==0||
                    inregistrare.getDataDeSfarsit().before(nowTimestamp)||
                    inregistrare.getSedinteRamase()==0)
            {
            InregistrareAbonament inregistrareAbonament =
                    new InregistrareAbonament(
                            pacient,
                            abonament,
                            nowTimestamp,
                            abonament.getTipAbonament());
            inregistrareAbonamentRepository.save(inregistrareAbonament);
        }else
            throw new RuntimeException("Pacientul are abonament activ cu "
                    +inregistrare.getSedinteRamase() +" sedinte neutilizate. " +
                    "Valabil pana in data " +inregistrare.getDataDeSfarsit());
    }
    //    metoda inregistrare fisa pacient
    public void saveFisaPacient(Pacient pacient, List<Medic> medici, List<Diagnostic> diagnostice){

    }


}
