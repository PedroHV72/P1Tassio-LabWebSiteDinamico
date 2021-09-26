package br.com.Pedro.ProvaP1LabSiteDinamico.Sistema.model.entity;

import java.util.List;

public class Administrador {
    private List<Categoria> categoriaList;

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
