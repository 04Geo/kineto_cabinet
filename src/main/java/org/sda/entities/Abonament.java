package org.sda.entities;

import javax.persistence.*;

//SELECT `abonamente`.`id`,
//    `abonamente`.`tip_abonament`,
//    `abonamente`.`pret`,
//    `abonamente`.`valabilitate_abonament`
//FROM `kinetocabinet`.`abonamente`;

@Entity
@Table(name = "abonamente")
public class Abonament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tip_abonament")
    private Integer tipAbonament;
    private String pret;
    @Column(name = "valabilitate_abonament")
    private Integer valabilitateAbonament;

    public Abonament() {
    }

    public Abonament( Integer tipAbonament, String pret, Integer valabilitateAbonament) {
        this.tipAbonament = tipAbonament;
        this.pret = pret;
        this.valabilitateAbonament = valabilitateAbonament;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(Integer tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public Integer getValabilitateAbonament() {
        return valabilitateAbonament;
    }

    public void setValabilitateAbonament(Integer valabilitateAbonament) {
        this.valabilitateAbonament = valabilitateAbonament;
    }

    @Override
    public String toString() {
        return "Abonamente{" +
                "id=" + id +
                ", tipAbonament='" + tipAbonament + '\'' +
                ", pret='" + pret + '\'' +
                ", valabilitateAbonament='" + valabilitateAbonament + '\'' +
                '}';
    }
}
