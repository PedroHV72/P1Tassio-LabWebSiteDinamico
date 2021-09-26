package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Repository;

import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;


public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public ArrayList<Produto> buscarPorId(Integer id) throws Exception {
        String sql = "SELECT * FROM produto WHERE id = ?";
        ArrayList<Produto> buscar = (ArrayList<Produto>) jdbcTemplate.query(sql, new ProdutoMapper(), id);

        if (buscar.size() > 0) {
            return (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{id}, new ProdutoMapper());
        }
        throw new Exception("Nenhum produto encontrado com este ID");
    }

    public Produto adicionar(Produto produto) throws Exception {
        String sql = "insert into produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario) values (?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getFotoUrl(),
                produto.getDataCadastro(),
                produto.getDataUltimaAtualizacao(),
                produto.getValorUnitario()
        );

        if(insert == 1) {
            return produto;
        }

        throw new Exception("Erro ao inserir o produto");
    }

}
