package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Repositories.ListeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ListeServiceImpl implements ListeService {
    @Autowired
    ListeRepository listeRepository;

    @Override
    public Liste CreerListe(Liste liste) {
        return listeRepository.save(liste);
    }

    @Override
    public Liste trouverListeParLibelle(String libelleliste) {
        return listeRepository.findBylibelleliste(libelleliste);
    }

    @Override
    public int ajouterListe(long id) {
        return 0;
    }

    // @Override
   // public Iterable<Object[]> AfficherListe() {
    //    return null;
   // }

   // @Override
   // public Iterable<Liste> afficherListe() {
    //    return listeRepository.findAll();
    //}

   // @Override
   // public String supprimerListe(long id) {
    //    listeRepository.deleteById(id);
      //  return "Liste "+id+" supprimée avec succès !";
    //}

    //@Override
    //public Liste modifierListe(Liste liste) {
      //  Liste listeExistante = listeRepository.findById(liste.getId()).orElse(null);
      //  listeExistante.setDateliste(liste.getDateliste());
       // listeExistante.setLibelleliste(liste.getLibelleliste());
       // return listeRepository.save(listeExistante);
    //}

   // @Override
    //public Liste ajouterListe(Liste liste) {
    //    return listeRepository.save(liste);
   // }
}
