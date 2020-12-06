package org.sda.service;

import org.sda.entities.Pacient;
import org.sda.repository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PacientService {
    PacientRepository pacientRepository;

    public PacientService(@Autowired PacientRepository pacientRepository) {
        this.pacientRepository = pacientRepository;
    }


    public List<Pacient> findAll() {
        return pacientRepository.findAll();
    }

    public Pacient findById(Integer id) {
        Optional pacient = pacientRepository.findById(id);
        if (!pacient.isPresent()) {
            throw new NoSuchElementException("Pacientul cu " + id + " nu a fost gasit!");
        }
        return (Pacient) pacient.get();
    }


    public Pacient save(Pacient employee) throws Exception {
//        if (employee.getAddress() != null && employee.getAddress().size() > 0){
        return pacientRepository.save(employee);
//        }
//        throw new  Exception("Cannot create an Employee without an Address");
    }

    public Pacient update(Pacient pacient) {

        return pacientRepository.save(pacient);

    }

    public void delete(Integer id) {

        pacientRepository.deleteById(id);

    }

}
