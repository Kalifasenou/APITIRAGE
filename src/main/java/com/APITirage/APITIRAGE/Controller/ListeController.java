package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Services.ListeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liste")
public class ListeController {
    @Autowired
    ListeService listeService;

    @PostMapping("/creerliste")
    public Liste create(@RequestBody Liste liste){
        return  listeService.CreerListe(liste);
    }
    @GetMapping("/nombreliste")
    int nombreListe(){
        return listeService.nombreListe();
    }
    @GetMapping("/lister")
    List<Liste> lister(){
        return listeService.lister();
    }
    @GetMapping("/listernom")
    List<Object> listerNom(){
        return listeService.listerNom();
    }
}
