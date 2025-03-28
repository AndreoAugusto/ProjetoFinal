package org.example.Entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.mysql.cj.exceptions.StreamingNotifiable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR")
    private Long id;
    @OneToMany(mappedBy = "conFornecedor", cascade = CascadeType.ALL)
    private List<Contato> contatos = new ArrayList<>();

    @Column(length = 100, name = "RAZAOSOCIAL", nullable = false)
    private String razaoSocial;

    @Column(length = 100, name = "NOMEFANTASIA", nullable = false)
    private String fantasia;

    @Column(length = 25, name = "CNPJ", nullable = false)
    private String cnpj;

    @Column(length = 25, name = "STATUS", nullable = false)
    private String status;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String razaoSocial, String fantasia, String cnpj, String status) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.status = status;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
