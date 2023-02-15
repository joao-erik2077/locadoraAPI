package br.com.etec.joik.locadoraAPI.repository;

import br.com.etec.joik.locadoraAPI.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long> {
}
