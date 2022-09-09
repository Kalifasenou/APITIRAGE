package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Liste;

import java.util.List;

public interface ListeService {


    Liste CreerListe(Liste liste);
  //  Iterable<Object[]>  AfficherListe();
  //  Iterable<Liste> afficherListe();
    Liste trouverListeParLibelle(String libelleliste);
    int nombreListe();
    List<Liste> lister();
    List<Object> listerNom();

    //Fonctionnalité de suppression d'un ou plusieurs liste(s)
    //String supprimerListe (long id);

    //Fonctionnalité de modification de liste
    //Liste modifierListe(Liste liste);

    //Fonctionnalité d'ajout d'une liste
    //Liste ajouterListe(Liste liste);




}
