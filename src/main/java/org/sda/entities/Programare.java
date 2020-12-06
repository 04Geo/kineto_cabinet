package org.sda.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "programator")
public class Programare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "pacient_id")
    private Pacient pacientId;
    @ManyToOne
    @JoinColumn(name = "angajat_id")
    private Angajat angajatId;
    @Column(name = "data_de_inceput")
    private Date dataDeInceput;
    @Column(name = "data_de_sfarsit")
    private Date dataDeSfarsit;

    public Programare() {
    }

    public Programare(Pacient pacientId, Angajat angajatId, Date dataDeInceput, Date dataDeSfarsit) {
        this.pacientId = pacientId;
        this.angajatId = angajatId;
        this.dataDeInceput = dataDeInceput;
        this.dataDeSfarsit = dataDeSfarsit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pacient getPacientId() {
        return pacientId;
    }

    public void setPacientId(Pacient pacientId) {
        this.pacientId = pacientId;
    }

    public Angajat getAngajatId() {
        return angajatId;
    }

    public void setAngajatId(Angajat angajatId) {
        this.angajatId = angajatId;
    }

    public Date getDataDeInceput() {
        return dataDeInceput;
    }

    public void setDataDeInceput(Date dataDeInceput) {
        this.dataDeInceput = dataDeInceput;
    }

    public Date getDataDeSfarsit() {
        return dataDeSfarsit;
    }

    public void setDataDeSfarsit(Date dataDeSfarsit) {
        this.dataDeSfarsit = dataDeSfarsit;
    }

    @Override
    public String toString() {
        return "Programare{" +
                "id=" + id +
                ", pacientId=" + pacientId +
                ", angajatId=" + angajatId +
                ", dataDeInceput=" + dataDeInceput +
                ", dataDeSfarsit=" + dataDeSfarsit +
                '}';
    }
}
