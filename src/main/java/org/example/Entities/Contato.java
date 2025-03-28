package org.example.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CON_FOR_ID")
    private Fornecedor conFornecedor;

    @Column(length = 25, name = "NUMERO", nullable = false)
    private String Numero;

    @Column(length = 25, name = "EMAIL", nullable = false)
    private String Email;


    public Contato() {
    }

    public Contato(Long id, Fornecedor conFornecedor, String numero, String email) {
        this.id = id;
        this.conFornecedor = conFornecedor;
        Numero = numero;
        Email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fornecedor getConFornecedor() {
        return conFornecedor;
    }

    public void setConFornecedor(Fornecedor conFornecedor) {
        this.conFornecedor = conFornecedor;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
