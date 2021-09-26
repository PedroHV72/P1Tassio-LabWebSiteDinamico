package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity;

import java.time.LocalTime;

public class Cartao {
    private Integer id;
    private LocalTime dataCriacao;
    private Boolean excluido;
    private TipoCartao tipoCartao;

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

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
}
