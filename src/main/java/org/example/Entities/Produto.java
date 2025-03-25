package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(length = 100, name = "DESCRICAO")
    private String descricao;

    @Column(length = 10, name = "PRECOCUSTO", nullable = false)
    private String precoCusto;

    @Column(length = 10, name = "PRECOVENDA", nullable = false)
    private String precoVenda;

    @Column(length = 10, name = "QTDE_ESTOQUE", nullable = false)
    private String qtde_estoque;

    public Produto() {
    }

    public Produto(Long id, String descricao, String precoCusto, String precoVenda, String qtde_estoque) {
        this.id = id;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtde_estoque = qtde_estoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getQtde_estoque() {
        return qtde_estoque;
    }

    public void setQtde_estoque(String qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }
}
