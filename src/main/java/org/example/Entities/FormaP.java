package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FormaP implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORMAP")
    private Long id;

    @Column(length = 25,name = "TIPO_FORMAP", nullable = false)
    private String tipo;

    @Column(length = 25, name = "STATUS_FORMAP", nullable = false)
    private String statusFP;

    @Column(length = 254, name = "DESCRICAO")
    private String descricao;

    public FormaP() {
    }

    public FormaP(Long id, String tipo, String statusFP, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.statusFP = statusFP;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatusFP() {
        return statusFP;
    }

    public void setStatusFP(String statusFP) {
        this.statusFP = statusFP;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
