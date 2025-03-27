package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(length = 100, name = "BAIRRO", nullable = false)
    private String bairro;

    @Column(length = 100, name = "RUA", nullable = false)
    private String rua;

    @Column(length = 10, name = "NUMERO", nullable = false)
    private String numero;

    @Column(length = 100, name = "COMPLEMENTO", nullable = false)
    private String complemento;

    public Endereco() {
    }
}
