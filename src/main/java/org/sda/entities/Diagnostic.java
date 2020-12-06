package org.sda.entities;

import javax.persistence.*;

//SELECT `diagnostice`.`id`,
//    `diagnostice`.`diagnostic`
//FROM `kinetocabinet`.`diagnostice`;

@Entity
@Table(name = "diagnostice")
public class Diagnostic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String diagnostic;

    public Diagnostic() {
    }

    public Diagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return "Diagnostice{" +
                "id=" + id +
                ", diagnostic='" + diagnostic + '\'' +
                '}';
    }
}
