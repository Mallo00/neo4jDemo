package it.nextre.academy.neo4j.repository;


import it.nextre.academy.neo4j.model.Film;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmRepository extends Neo4jRepository<Film, Integer> {

    Optional<Film> findById(Integer id);

    Film findByName(String nome);

}
