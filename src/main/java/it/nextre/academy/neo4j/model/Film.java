package it.nextre.academy.neo4j.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    @Id
    private Integer id;
    private String name;
    private String autore;

}//end class
