package org.sda.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fise_pacienti")
public class FisaPacient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "pacient_Id")
    private Pacient pacientId;
    @ManyToOne
    @JoinColumn(name = "diagnostic_Id")
    private Angajat diagnosticId;
    @ManyToOne
    @JoinColumn(name = "medic_Id")
    private Angajat medicId;
    @Column(name= "data_diagnostic")
    private Date dataDiagnostic;

    public FisaPacient() {
    }

    public FisaPacient(Integer id, Pacient pacientId, Angajat diagnosticId, Angajat medicId, Date dataDiagnostic) {
        this.id = id;
        this.pacientId = pacientId;
        this.diagnosticId = diagnosticId;
        this.medicId = medicId;
        this.dataDiagnostic = dataDiagnostic;
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

    public Angajat getDiagnosticId() {
        return diagnosticId;
    }

    public void setDiagnosticId(Angajat diagnosticId) {
        this.diagnosticId = diagnosticId;
    }

    public Angajat getMedicId() {
        return medicId;
    }

    public void setMedicId(Angajat medicId) {
        this.medicId = medicId;
    }

    public Date getDataDiagnostic() {
        return dataDiagnostic;
    }

    public void setDataDiagnostic(Date dataDiagnostic) {
        this.dataDiagnostic = dataDiagnostic;
    }

    @Override
    public String toString() {
        return "FisaPacient{" +
                "id=" + id +
                ", pacientId=" + pacientId +
                ", diagnosticId=" + diagnosticId +
                ", medicId=" + medicId +
                ", dataDiagnostic=" + dataDiagnostic +
                '}';
    }
}
