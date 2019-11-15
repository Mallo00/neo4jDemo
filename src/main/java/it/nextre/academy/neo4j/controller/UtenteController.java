package it.nextre.academy.neo4j.controller;


import it.nextre.academy.neo4j.model.Film;
import it.nextre.academy.neo4j.model.Utente;
import it.nextre.academy.neo4j.service.FilmServiceImpl;
import it.nextre.academy.neo4j.service.UtenteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/utente")
public class UtenteController {


    @Autowired
    UtenteServiceImpl utenteService;

    @Autowired
    FilmServiceImpl filmService;

    @GetMapping
    public List<Utente> getAll() {
        return utenteService.findAll();
    }


    @GetMapping("/add")
    public Utente addOne() {
        Utente tmp = utenteService.addOne();
        System.out.println(tmp);
        return tmp;
    }

    @PostMapping("/valutazione")
    public Film addValutazione(@RequestBody @Valid Film tmp) {
        tmp = filmService.findByName(tmp.getName());
        return tmp;
    }

}//end class
