package org.sda.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "patientId")
    private User patient;
    @ManyToOne
    @JoinColumn(name = "personnelId")
    private User personnel;
    private Date beginningDate;
    private Date endDate;

    public Schedule() {
    }

    public Schedule(Integer id, User patient, User personnel, Date beginningDate, Date endDate) {
        this.id = id;
        this.patient = patient;
        this.personnel = personnel;
        this.beginningDate = beginningDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public User getPersonnel() {
        return personnel;
    }

    public void setPersonnel(User personnel) {
        this.personnel = personnel;
    }

    public Date getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(Date beginningDate) {
        this.beginningDate = beginningDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Programare{" +
                "id=" + id +
                ", pacientId=" + patient +
                ", angajatId=" + personnel +
                ", dataDeInceput=" + beginningDate +
                ", dataDeSfarsit=" + endDate +
                '}';
    }
}
