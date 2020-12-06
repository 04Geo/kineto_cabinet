package org.sda.entities;

//SELECT `specializari`.`id`,
//    `specializari`.`specializare`
//FROM `kinetocabinet`.`specializari`;

import javax.persistence.*;

@Entity
@Table(name = "specializari")
public class Specializare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String specializare;

    public Specializare() {
    }

    public Specializare(String specializare) {
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Specializari{" +
                "id=" + id +
                ", specializare='" + specializare + '\'' +
                '}';
    }
}
