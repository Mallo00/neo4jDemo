package it.nextre.academy.neo4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente {

    @Id
    private Integer id;
    private String nome;
    private Integer eta;

    @Relationship(type = "VALUTAZIONE", direction = Relationship.INCOMING)
    private Set<Film> film = new HashSet<>();

}//end class

