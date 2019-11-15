package it.nextre.academy.neo4j.controller;


import it.nextre.academy.neo4j.model.Film;
import it.nextre.academy.neo4j.service.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    FilmServiceImpl filmService;

    @GetMapping
    public List<Film> getAll() {
        return filmService.findAll();
    }


    @GetMapping("/add")
    public Film addOne() {
        Film tmp = filmService.addOne();
        System.out.println(tmp);
        return tmp;
    }

}//end class
