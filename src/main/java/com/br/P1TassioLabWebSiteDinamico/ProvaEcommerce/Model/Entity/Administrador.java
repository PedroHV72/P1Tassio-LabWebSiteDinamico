package com.br.P1TassioLabWebSiteDinamico.ProvaEcommerce.Model.Entity;

import java.util.List;

public class Administrador extends Usuario{
    private List<Categoria> categoriaList;

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
