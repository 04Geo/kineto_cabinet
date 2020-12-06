package org.sda.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//SELECT `angajati`.`id`,
//    `angajati`.`cnp`,
//    `angajati`.`nume`,
//    `angajati`.`prenume`,
//    `angajati`.`telefon`,
//    `angajati`.`email`
//FROM `kinetocabinet`.`angajati`;

@Entity
@Table(name="angajati")
public class Angajat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cnp;
    private String nume;
    private String prenume;
    private String telefon;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER) //cand ne aduce angajatii ne aduce si lista de specializri
    @JoinTable(
            name = "specializari_angajati",
            joinColumns = { @JoinColumn (name= "angajat_id")},
            inverseJoinColumns = { @JoinColumn(name="specializare_id")}
    )

    List<Specializare> specializari = new ArrayList<>();

    public Angajat() {
    }

    public Angajat(String cnp, String nume, String prenume, String telefon, String email,List<Specializare> specializari) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.email = email;
        this.specializari=specializari;
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

    public List<Specializare> getSpecializari() {
        return specializari;
    }

    public void setSpecializari(List<Specializare> specializari) {
        this.specializari = specializari;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + id +
                ", cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", specializari=" + specializari +
                '}';
    }
}
