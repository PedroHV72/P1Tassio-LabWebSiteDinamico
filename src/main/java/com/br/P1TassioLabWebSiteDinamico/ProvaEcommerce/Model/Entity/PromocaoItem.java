package br.com.Pedro.ProvaP1LabSiteDinamico.Sistema.model.entity;

import java.time.LocalTime;

public class PromocaoItem {
    private Integer id;
    private Float valorPromocao;
    private LocalTime dataCadastro;
    private LocalTime dataUltimaAtualizacao;
    private Produto produto;
    private TabelaPromocao tabelaPromocao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(Float valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public LocalTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public TabelaPromocao getTabelaPromocao() {
        return tabelaPromocao;
    }

    public void setTabelaPromocao(TabelaPromocao tabelaPromocao) {
        this.tabelaPromocao = tabelaPromocao;
    }
}
