package br.com.etec.joik.locadoraAPI.repository;

import br.com.etec.joik.locadoraAPI.model.Filmes;
import br.com.etec.joik.locadoraAPI.repository.filmes.FilmesRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepository extends JpaRepository<Filmes, Long>, FilmesRepositoryQuery {
}
