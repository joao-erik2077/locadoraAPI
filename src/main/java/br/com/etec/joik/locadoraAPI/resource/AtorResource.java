package br.com.etec.joik.locadoraAPI.resource;

import br.com.etec.joik.locadoraAPI.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ator")
public class AtorResource {

    @Autowired
    private AtorRepository atorRepository;
}
