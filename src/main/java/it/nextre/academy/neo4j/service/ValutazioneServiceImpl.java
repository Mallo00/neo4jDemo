package it.nextre.academy.neo4j.service;

import it.nextre.academy.neo4j.model.Valutazione;
import it.nextre.academy.neo4j.repository.ValutazioneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ValutazioneServiceImpl {

    @Autowired
    ValutazioneRepository valutazioneRepository;

    Logger log = LoggerFactory.getLogger(this.getClass());

    /*
    public Valutazione addUtenteFilm(Film f, Utente u) {
        Random r = new Random();
        Valutazione v = new Valutazione(null, r.nextInt(10 - 1) + 1, u, f);
        log.debug("Creando persona:  + ValutazioneServiceImpl.addUtenteFilm()" + v);
        System.out.println(v);
        return v;
    }
*/
    public Valutazione save(Valutazione v) {
        log.debug("Salvando persona: " + v);
        return valutazioneRepository.save(v);
    }

    /*
    public List<Valutazione> getall() {
        return (List<Valutazione>) valutazioneRepository.findAll();
    }
    */

}//end class
