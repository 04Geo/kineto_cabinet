package org.sda.entities;

import javax.persistence.*;
import java.util.Date;


//SELECT `registru_abonamente`.`id`,
//    `registru_abonamente`.`pacient_id`,
//    `registru_abonamente`.`abonament_id`,
//    `registru_abonamente`.`data_de_sfarsit`
//FROM `kinetocabinet`.`registru_abonamente`;

@Entity
@Table(name = "registru_abonamente")
public class InregistrareAbonament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "pacient_Id")
    private Pacient pacient;
    @ManyToOne
    @JoinColumn(name = "abonament_Id")
    private Abonament abonament;
    @Column(name = "data_de_sfarsit")
    private Date dataDeSfarsit;
    @Column(name = "sedinte_ramase")
    private Integer sedinteRamase;

    public InregistrareAbonament() {
    }

    public InregistrareAbonament(Pacient pacient, Abonament abonament, Date dataDeSfarsit, Integer sedinteRamase) {
        this.pacient = pacient;
        this.abonament = abonament;
        this.dataDeSfarsit = dataDeSfarsit;
        this.sedinteRamase = sedinteRamase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pacient getPacientId() {
        return pacient;
    }

    public void setPacientId(Pacient pacientId) {
        this.pacient = pacientId;
    }

    public Abonament getAbonamentTypeId() {
        return abonament;
    }

    public void setAbonamentTypeId(Abonament abonamentTypeId) {
        this.abonament = abonamentTypeId;
    }


    public Date getDataDeSfarsit() {
        return dataDeSfarsit;
    }

    public void setDataDeSfarsit(Date dataDeSfarsit) {
        this.dataDeSfarsit = dataDeSfarsit;
    }

    public Integer getSedinteRamase() {
        return sedinteRamase;
    }

    public void setSedinteRamase(Integer sedinteRamase) {
        this.sedinteRamase = sedinteRamase;
    }

    @Override
    public String toString() {
        return "InregistrareAbonament{" +
                "id=" + id +
                ", pacientId=" + pacient +
                ", abonament=" + abonament +
                ", dataDeSfarsit=" + dataDeSfarsit +
                ", sedinteRamase=" + sedinteRamase +
                '}';
    }
}
