package br.com.etec.joik.locadoraAPI.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="filmes")
public class Filmes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nomefilme;

    @ManyToOne
    @JoinColumn(name="generoid")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name="atorid")
    private Ator ator;

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

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filmes filmes = (Filmes) o;
        return id.equals(filmes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
