package br.com.etec.joik.locadoraAPI.resource;

import br.com.etec.joik.locadoraAPI.model.Filmes;
import br.com.etec.joik.locadoraAPI.repository.FilmesRepository;
import br.com.etec.joik.locadoraAPI.repository.filter.FilmeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesResource {

    @Autowired
    private FilmesRepository filmesRepository;

    @RequestMapping("/todos")
    public List<Filmes> listarTodosFilmes() {
        return filmesRepository.findAll(Sort.by("nomefilme").ascending());
    }

    @GetMapping()
    public Page<Filmes> pesquisar(FilmeFilter filmesFilter, Pageable pageable) {
        return filmesRepository.filtrar(filmesFilter, pageable);
    }
}
