package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Services.ListeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ListeController {
    @Autowired
    ListeService listeService;

    @GetMapping(value = "/liste")
    public Iterable<Liste> afficherListe() {
        return listeService.afficherListe();
    }

    @PostMapping(value = "/creerliste")
    public Liste creerListe(Liste liste) {
        return listeService.ajouterListe(liste);
    }

    @PutMapping(value = "/modifierliste")
    public Liste modifierListe(Liste liste) {
        return listeService.modifierListe(liste);
    }

    @DeleteMapping(value = "/supprimerliste/{id}")
    public String supprimerListe(@PathVariable long id) {
        return listeService.supprimerListe(id);
    }

}
