package br.com.Pedro.ProvaP1LabSiteDinamico.Sistema.model.entity;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


public class Cliente extends Usuario {

    private String fotoUrl;
    private String cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private List<Pedido> pedidoList;
    private Cartao cartao;

    public Cliente(Integer id, String nomeCompleto, String email, String senha, LocalDate dataCadastro, LocalTime horaCadastro, LocalDate dataUltimaAtualizacao, String urlFoto, String fotoUrl, String cpf, LocalDate dataNascimento, Endereco endereco, List<Pedido> pedidoList) {
        super(id, nomeCompleto, email, senha, dataCadastro, horaCadastro, dataUltimaAtualizacao, urlFoto);
        this.fotoUrl = fotoUrl;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.pedidoList = pedidoList;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    private static class Endereco {
        private Integer id;
        private String rua;
        private Integer numero;
        private String cep;
        private String complemento;
        private Integer telefone;
        private String bairro;
        private LocalDate dataCadastro;
        private LocalTime horaCadastro;
        private LocalDate dataUltimaAtualizacao;
        private Cidade cidade;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public Integer getTelefone() {
            return telefone;
        }

        public void setTelefone(Integer telefone) {
            this.telefone = telefone;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public LocalDate getDataCadastro() {
            return dataCadastro;
        }

        public void setDataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        public LocalTime getHoraCadastro() {
            return horaCadastro;
        }

        public void setHoraCadastro(LocalTime horaCadastro) {
            this.horaCadastro = horaCadastro;
        }

        public LocalDate getDataUltimaAtualizacao() {
            return dataUltimaAtualizacao;
        }

        public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        }

        public Cidade getCidade() {
            return cidade;
        }

        public void setCidade(Cidade cidade) {
            this.cidade = cidade;
        }
    }
}
