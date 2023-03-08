package br.com.etec.joik.locadoraAPI.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="genero")
public class Genero {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    @OneToMany(mappedBy="genero")
    @JsonIgnore
    private List<Filmes> filmesgenero = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Filmes> getFilmesgenero() {
        return filmesgenero;
    }

    public void setFilmesgenero(List<Filmes> filmesgenero) {
        this.filmesgenero = filmesgenero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero genero = (Genero) o;
        return id.equals(genero.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
