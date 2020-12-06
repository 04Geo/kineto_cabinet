package org.sda.entities;

import javax.persistence.*;

//SELECT `pacienti`.`id`,
//    `pacienti`.`cnp`,
//    `pacienti`.`nume`,
//    `pacienti`.`prenume`,
//    `pacienti`.`telefon`,
//    `pacienti`.`email`
//FROM `kinetocabinet`.`pacienti`;

@Entity
@Table(name="pacienti")
public class Pacient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cnp;
    private String nume;
    private String prenume;
    private String telefon;
    private String email;

    public Pacient() {
    }

    public Pacient(String cnp, String nume, String prenume, String telefon, String email) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
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
        return "Pacienti{" +
                "id=" + id +
                ", cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
