package br.com.etec.joik.locadoraAPI.repository;

import br.com.etec.joik.locadoraAPI.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FIlmesRepository extends JpaRepository<Filmes, Long> {
}
