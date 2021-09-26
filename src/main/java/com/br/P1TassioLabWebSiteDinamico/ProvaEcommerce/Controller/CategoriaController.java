package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Controller;


import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Categoria;
import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Produto;
import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private CategoriaRepository categoriaRepository;

    public CategoriaController(JdbcTemplate jdbcTemplate) {
        categoriaRepository = new CategoriaRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Categoria> buscarPorId(@PathVariable Integer id) throws Exception {
        return categoriaRepository.buscarPorId(id);
    }

    @GetMapping("/{id}/produto")
    public List<Produto> buscarProdutosCategoria(
            @PathVariable int id,
            @RequestParam(required = false) String nome, Float valorMinimo, Float valorMaximo
    ) {
        return categoriaRepository.buscarProdutosCategoria(id, nome, valorMinimo, valorMaximo);
    }
}
