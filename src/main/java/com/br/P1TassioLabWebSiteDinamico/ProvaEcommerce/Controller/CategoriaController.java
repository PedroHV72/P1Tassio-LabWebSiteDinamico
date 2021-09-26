package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Controller;


import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Categoria;
import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
}
