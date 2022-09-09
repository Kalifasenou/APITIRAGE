package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Modeles.Message;
import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Modeles.Tirage;
import com.APITirage.APITIRAGE.Services.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
   @Autowired
   private PostulantServiceImpl postulantServiceIml;
  private final    PostulantsTireService postulantsTireService;
    @Autowired
    TirageServiceImpl tirageServiceImpl;
    @GetMapping("/nombretirage")
    int nombreTirage() {
        return tirageService.nombreTirage();
    }

    @GetMapping("/nombrelistetiree")
    int nombreListeTiree() {
        return tirageService.nombreListeTiree();
    }
    @GetMapping("/tirageparliste/{nomliste}")
    int tirageParListe(@PathVariable String nomliste) {
        return tirageService.listerNombreTirage(nomliste);
    }

    @GetMapping("/listetirages")
    List<Tirage> listerTirage() {
        return tirageService.afficherTirage();
    }
    @PostMapping(value = "/createTirage/{libelleliste}/{nbre}")

    public Object create(@RequestBody Tirage tirage, @PathVariable String libelleliste, @PathVariable long nbre){


        try {

            Liste liste =listeService.trouverListeParLibelle(libelleliste);
            List<Postulant> post= postulantService.TrouverIdPostList(liste.getId());

            Object lp= tirageService.creer(tirage,post,nbre);
            Long id_tirage =tirageService.trouverTirageParLibelle(tirage.getLibelletirage()).getId();
            for (Postulant p :(List<Postulant>)lp){

                postulantsTireService.creer(p.getId(),p.getNom(),p.getPrenom(),p.getNumero(),p.getEmail(),id_tirage);
                postulantServiceIml.supprimerPostulant(p.getId());
            }
            return postulantsTireService.lirePostulantTireparnom(tirage.getLibelletirage());//"Tirage effectué avec succès ! \uD83D\uDE09 \uD83D\uDE09";
        } catch (IllegalArgumentException e) {
            return Message.ErreurReponse("\uD83D\uDE1E☹️ Vous ne pouvez pas tirer "+nbre+" du nombre de postulants restants", HttpStatus.OK);
        } catch (DataIntegrityViolationException e) {
            return Message.ErreurReponse("Ce tirage est déjà effectué !\uD83D\uDE1E☹️ ", HttpStatus.OK);
        }

    }

}
