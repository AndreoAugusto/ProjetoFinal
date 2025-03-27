package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long id;

    @Column(length = 25, name = "NUMERO_CONTATO", nullable = false)
    private String numero;

    public Contato() {
    }


}
