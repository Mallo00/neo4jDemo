package it.nextre.academy.neo4j.service;


import it.nextre.academy.neo4j.DummyData;
import it.nextre.academy.neo4j.model.Film;
import it.nextre.academy.neo4j.repository.FilmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class FilmServiceImpl {

    private static AtomicInteger cont = new AtomicInteger();
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FilmRepository filmRepository;

    public List<Film> findAll() {
        return (List) filmRepository.findAll();
    }

    public Film findOneById(Integer id) {
        return filmRepository.findById(id).orElseThrow(() -> new RuntimeException("Film non presente"));
    }

    public Film addOne() {
        Film f = new Film(cont.addAndGet(1), DummyData.getMovies(), DummyData.getDirectors());
        f = filmRepository.save(f);
        System.out.println(f);
        return f;
    }

    public Film findByName(String name) {
        Film f = filmRepository.findByName(name);
        logger.debug("Ho trovato la persona" + f);
        return f;
    }

}//end class
