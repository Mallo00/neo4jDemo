package it.nextre.academy.neo4j.controller;

import it.nextre.academy.neo4j.model.Valutazione;
import it.nextre.academy.neo4j.service.FilmServiceImpl;
import it.nextre.academy.neo4j.service.UtenteServiceImpl;
import it.nextre.academy.neo4j.service.ValutazioneServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valutazione")
public class ValutazioneController {

    private static Integer i = 0;
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ValutazioneServiceImpl valutazioneService;

    @Autowired
    UtenteServiceImpl utenteService;

    @Autowired
    FilmServiceImpl filmService;
/*
    @PostMapping
    public Valutazione addValutazion1e(@RequestParam("valutazione") Integer valutazione,@RequestParam("idFilm") Integer idFilm,@RequestParam("idUtente") Integer idUtente) {
        Valutazione v = new Valutazione(i++, valutazione, utenteService.findOneById(idUtente), filmService.findOneById(idFilm));
        log.debug("log: ValutazioneController.addValutazione(): " + v);
        valutazioneService.save(v);
        return v;
    }

 */

    @PostMapping()
    public Valutazione addValutazione(@RequestBody Valutazione tmp) {
        log.debug("LOG: ValutazioneController.addValutazione(): " + tmp);
        tmp.setUtente(utenteService.findOneById(tmp.getUtenteId()));
        tmp.setFilm(filmService.findOneById(tmp.getFilmId()));
        return tmp;
    }

    /*
    @GetMapping("/all")
    public List<Valutazione> getAll() {
        log.debug("Stampa di tutte le valutazioni");
        return valutazioneService.getall();
    }
*/
}//end class
