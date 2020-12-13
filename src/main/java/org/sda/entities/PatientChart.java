package org.sda.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patientchart")
public class PatientChart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "patientId")
    private User patientId;
    @ManyToOne
    @JoinColumn(name = "personnelId")
    private User personnelId;
    @Column(name= "diagnosticDate")
    private Date diagnosticDate;
    private String diagnostic;


    public PatientChart() {
    }

    public PatientChart(Integer id, User patientId, User personnelId, Date diagnosticDate, String diagnostic) {
        this.id = id;
        this.patientId = patientId;
        this.personnelId = personnelId;
        this.diagnosticDate = diagnosticDate;
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return "PatientChart{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", personnelId="+ personnelId +
                ", dataDiagnostic=" + diagnosticDate +
                ", diagnosticId=" + diagnostic +
                '}';
    }
}
