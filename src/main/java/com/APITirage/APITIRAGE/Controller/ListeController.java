package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Services.ListeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ListeController {
    @Autowired
    ListeService listeService;

    @PostMapping("/creerliste")
    public Liste create(@RequestBody Liste liste){

        return  listeService.CreerListe(liste);
    }
}
