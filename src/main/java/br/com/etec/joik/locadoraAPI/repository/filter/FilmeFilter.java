package br.com.etec.joik.locadoraAPI.repository.filter;

import br.com.etec.joik.locadoraAPI.model.Ator;
import br.com.etec.joik.locadoraAPI.model.Genero;

public class FilmeFilter {
    private String nomefilme;

    private Genero genero;

    private Ator ator;

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }
}
