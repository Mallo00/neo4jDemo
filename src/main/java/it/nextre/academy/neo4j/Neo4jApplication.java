package it.nextre.academy.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
public class Neo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jApplication.class, args);

        System.out.println("Basato sul tutorial: https://www.youtube.com/watch?v=RjEK3Q6GMzw");
        System.out.println("Approfondimento a: https://siagas.math.unipd.it/siagas/getTesi.php?id=1837");
	}

}
