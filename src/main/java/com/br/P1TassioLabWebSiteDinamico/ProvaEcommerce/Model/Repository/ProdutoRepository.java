package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Repository;

import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Categoria;
import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;


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
            for(Categoria categoria : produto.getCategoriaList()) {
                jdbcTemplate.update("INSERT INTO produtoCategoria(id, produtoId, categoriaId) VALUES(?, ?, ?)",
                        4, produto.getId(), categoria.getId()
                );
            }

            List<Categoria> categoriaList = jdbcTemplate.query("SELECT c.* FROM categoria c, produto p, produtoCategoria pc WHERE p.id = pc.produtoId AND c.id = pc.categoriaId AND produtoId = ?",
                    new CategoriaMapper(), produto.getId()
            );

            produto.setCategoriaList(categoriaList);

            return produto;
        }

        throw new Exception("Erro ao inserir o produto");
    }

    public List<Produto> buscarProdutoPeloFiltro(String nome, Float valorMinimo, Float valorMaximo){
        if (nome != null && valorMinimo == null && valorMaximo == null) {
            return jdbcTemplate.query(
                    "SELECT * FROM PRODUTO WHERE nome = ?",
                    new ProdutoMapper(),
                    nome
            );
        }
        if (nome == null && valorMinimo != null && valorMaximo != null) {
            return jdbcTemplate.query(
                    "SELECT * FROM PRODUTO WHERE valorUnitario >= ? AND valorUnitario <= ?",
                    new ProdutoMapper(),
                    valorMinimo,
                    valorMaximo
            );
        }
        return jdbcTemplate.query(
                "SELECT * FROM PRODUTO WHERE nome = ? AND valorUnitario >= ? AND valorUnitario <= ?",
                new ProdutoMapper(),
                nome,
                valorMinimo,
                valorMaximo
        );
    }

}
