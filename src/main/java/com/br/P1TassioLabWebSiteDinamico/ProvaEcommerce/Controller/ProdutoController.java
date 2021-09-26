package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Controller;

import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity.Produto;
import com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Produto inserir(@RequestBody Produto produto) throws Exception {
        return produtoRepository.adicionar(produto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Produto> buscarPorId(@PathVariable Integer id) throws Exception {
        return produtoRepository.buscarPorId(id);
    }

    @GetMapping()
    public List<Produto> buscarProdutosFiltro(
            @RequestParam(required = false) String nome, Float valorMinimo, Float valorMaximo
    ) {
        return produtoRepository.buscarProdutoPeloFiltro(nome, valorMinimo, valorMaximo);
    }
}
