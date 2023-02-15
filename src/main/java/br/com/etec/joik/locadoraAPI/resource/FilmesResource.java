package br.com.etec.joik.locadoraAPI.resource;

import br.com.etec.joik.locadoraAPI.repository.FIlmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("filmes")
public class FilmesResource {

    @Autowired
    private FIlmesRepository fIlmesRepository;
}
