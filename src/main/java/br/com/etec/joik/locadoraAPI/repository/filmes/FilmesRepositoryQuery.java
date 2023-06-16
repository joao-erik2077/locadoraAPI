package br.com.etec.joik.locadoraAPI.repository.filmes;

import br.com.etec.joik.locadoraAPI.repository.filter.FilmesFilter;
import br.com.etec.joik.locadoraAPI.repository.projections.FilmesDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmesRepositoryQuery {
  public Page<FilmesDTO> filtrar(FilmesFilter filmeFilter, Pageable pageable);
}
