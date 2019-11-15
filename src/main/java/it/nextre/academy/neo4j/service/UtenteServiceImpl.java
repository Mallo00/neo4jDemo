package it.nextre.academy.neo4j.service;


import it.nextre.academy.neo4j.DummyData;
import it.nextre.academy.neo4j.model.Utente;
import it.nextre.academy.neo4j.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UtenteServiceImpl {

    private static AtomicInteger cont = new AtomicInteger();

    @Autowired
    UtenteRepository utenteRepository;

    public List<Utente> findAll() {
        return (List) utenteRepository.findAll();
    }

    public Utente findOneById(Integer id) {
        return utenteRepository.findById(id).orElseThrow(() -> new RuntimeException("Utente non presente"));
    }

    public Utente addOne() {
        Utente u = new Utente(cont.addAndGet(1), DummyData.getName(), DummyData.getAge(), null);
        u = utenteRepository.save(u);
        System.out.println(u);
        return u;
    }

}//end class
