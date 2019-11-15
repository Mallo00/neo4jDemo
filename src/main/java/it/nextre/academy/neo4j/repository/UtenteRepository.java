package it.nextre.academy.neo4j.repository;


import it.nextre.academy.neo4j.model.Utente;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepository extends Neo4jRepository<Utente, Integer> {

    Optional<Utente> findById(Integer id);


}
