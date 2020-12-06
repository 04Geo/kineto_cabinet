package org.sda.entities;

import javax.persistence.*;

//SELECT `medici`.`id`,
//    `medici`.`nume`,
//    `medici`.`prenume`,
//    `medici`.`specializare`,
//    `medici`.`telefon`,
//    `medici`.`email`
//FROM `kinetocabinet`.`medici`;

@Entity
@Table(name = "medici")
public class Medic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nume;
    private String prenume;
    private String specializare;
    private String telefon;
    private String email;

    public Medic() {
    }

    public Medic( String nume, String prenume, String specializare, String telefon, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.specializare = specializare;
        this.telefon = telefon;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Medici{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", specializare='" + specializare + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
