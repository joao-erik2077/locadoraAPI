package br.com.etec.joik.locadoraAPI.resource;

import br.com.etec.joik.locadoraAPI.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("genero")
public class GeneroResource {

    @Autowired
    private GeneroRepository generoRepository;
}
