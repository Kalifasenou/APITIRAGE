package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Modeles.Message;
import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Modeles.Tirage;
import com.APITirage.APITIRAGE.Services.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tirage")
@AllArgsConstructor
public class TirageController {
   private final    TirageService tirageService;
  private final ListeService listeService;
   private final PostulantService postulantService;
  private final    PostulantsTireService postulantsTireService;
    @Autowired
    TirageServiceImpl tirageServiceImpl;
    @PostMapping(value = "/createTirage/{libelleliste}/{nbre}")

    public Object create(@RequestBody Tirage tirage, @PathVariable String libelleliste, @PathVariable long nbre){
        try {
            Liste liste =listeService.trouverListeParLibelle(libelleliste);
            List<Postulant> post= postulantService.TrouverIdPostList(liste.getId());

            List<Postulant> lp= tirageService.creer(tirage,post,nbre);
            Long id_tirage =tirageService.trouverTirageParLibelle(tirage.getLibelletirage()).getId();
            for (Postulant p :lp){

                postulantsTireService.creer(p.getId(),p.getNom(),p.getPrenom(),p.getNumero(),p.getEmail(),id_tirage);
            }
            return "Tirage effectué avec succès ! \uD83D\uDE09 \uD83D\uDE09";
        } catch (Exception e) {
            return Message.ErreurReponse("Ce tirage est déjà effectué !\uD83D\uDE1E☹️ ", HttpStatus.OK);
        }

    }

}
