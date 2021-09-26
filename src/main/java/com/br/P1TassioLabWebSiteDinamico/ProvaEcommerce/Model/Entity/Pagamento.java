package br.com.Pedro.ProvaP1LabSiteDinamico.Sistema.model.entity;

import java.time.LocalTime;

public class Pagamento {
    private Integer id;
    private LocalTime dataCriacao;
    private Boolean excluido;
    private Cartao cartao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
}
