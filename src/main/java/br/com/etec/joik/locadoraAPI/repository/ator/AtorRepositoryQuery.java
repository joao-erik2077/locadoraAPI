package br.com.etec.joik.locadoraAPI.repository.ator;

import br.com.etec.joik.locadoraAPI.model.Ator;
import br.com.etec.joik.locadoraAPI.repository.filter.AtorFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AtorRepositoryQuery {
  public Page<Ator> filtrar(AtorFilter atorFilter, Pageable pageable);
}
