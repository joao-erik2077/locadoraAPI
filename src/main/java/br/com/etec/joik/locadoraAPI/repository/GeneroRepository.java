package br.com.etec.joik.locadoraAPI.repository;

import br.com.etec.joik.locadoraAPI.model.Genero;
import br.com.etec.joik.locadoraAPI.repository.genero.GeneroRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>, GeneroRepositoryQuery {
}
