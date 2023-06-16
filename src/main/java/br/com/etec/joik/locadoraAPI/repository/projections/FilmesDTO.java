package br.com.etec.joik.locadoraAPI.repository.projections;

import java.util.Objects;

public class FilmesDTO {
    private Long id;
    private String nomefilme;
    private String descricao; // nome do genero
    private String nomeator;

    public FilmesDTO(Long id, String nomefilme, String descricao, String nomeator) {
        this.id = id;
        this.nomefilme = nomefilme;
        this.descricao = descricao;
        this.nomeator = nomeator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmesDTO filmesDTO = (FilmesDTO) o;
        return Objects.equals(id, filmesDTO.id) && Objects.equals(nomefilme, filmesDTO.nomefilme) && Objects.equals(descricao, filmesDTO.descricao) && Objects.equals(nomeator, filmesDTO.nomeator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomefilme, descricao, nomeator);
    }
}
