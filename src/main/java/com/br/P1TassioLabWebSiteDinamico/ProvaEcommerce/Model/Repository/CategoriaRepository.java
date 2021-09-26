package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Repository;

import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Categoria;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class CategoriaRepository {
    private JdbcTemplate jdbcTemplate;

    public CategoriaRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public ArrayList<Categoria> buscarListaCategoria(Integer id,
                                                     String imagemSimboloUrl,
                                                     String nome,
                                                     String descricao)
        throws Exception {

            String sql = "SELECT * FROM categoria";
            ArrayList<Categoria> buscar = (ArrayList<Categoria>) jdbcTemplate.query(sql, new Object[]{id, imagemSimboloUrl, nome, descricao}, new CategoriaMapper());

            if(buscar.size() > 0) {
                return (ArrayList<Categoria>) jdbcTemplate.query(sql, new Object[]{id, imagemSimboloUrl, nome, descricao}, new CategoriaMapper());
            }

            throw new Exception("Categoria não encontrada");

    }

    public Categoria adicionar(Categoria categoria) throws Exception {
        String sql = "insert into categoria(id, imagemSimboloUrl, nome, descricao) values (?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                categoria.getId(),
                categoria.getImagemSimboloUrl(),
                categoria.getNome(),
                categoria.getDescricao()
        );

        if(insert == 1) {
            return categoria;
        }

        throw new Exception("Erro ao inserir a categoria");
    }

    public ArrayList<Categoria> buscarPorId(Integer id) throws Exception {
        String sql = "SELECT * FROM categoria WHERE id = ?";
        ArrayList<Categoria> buscar = (ArrayList<Categoria>) jdbcTemplate.query(sql, new CategoriaMapper(), id);

        if (buscar.size() > 0) {
            return (ArrayList<Categoria>) jdbcTemplate.query(sql, new Object[]{id}, new CategoriaMapper());
        }
        throw new Exception("Nenhuma categoria encontrada com este ID.");
    }
}
