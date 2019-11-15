package it.nextre.academy.neo4j.repository;

import it.nextre.academy.neo4j.model.Valutazione;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValutazioneRepository extends Neo4jRepository<Valutazione, Integer> {

//    Valutazione addFilmUtente();

// List<Valutazione> getAll();

}
