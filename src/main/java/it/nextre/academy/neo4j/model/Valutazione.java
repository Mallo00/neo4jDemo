package it.nextre.academy.neo4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RelationshipEntity(type = "VALUTAZIONE")
public class Valutazione {
    @Id
    private Integer relationshipId;
    @Property
    private Integer valutazione;
    @StartNode
    private Utente utente;
    @EndNode
    private Film film;

    private Integer utenteId;
    private Integer filmId;

}
