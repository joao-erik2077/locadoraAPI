package br.com.etec.joik.locadoraAPI.repository.filmes;

import br.com.etec.joik.locadoraAPI.model.Filmes;
import br.com.etec.joik.locadoraAPI.repository.filter.FilmeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmesRepositoryQuery {
  public Page<Filmes> filtrar(FilmeFilter filmeFilter, Pageable pageable);
}
