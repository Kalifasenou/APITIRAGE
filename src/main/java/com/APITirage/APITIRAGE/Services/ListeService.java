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

  List<Liste> listerTiree();

  Liste afficherNom(long idliste);


  //Fonctionnalit√© de suppression d'un ou plusieurs liste(s)
    //String supprimerListe (long id);

    //Fonctionnalit√© de modification de liste
    //Liste modifierListe(Liste liste);

    //Fonctionnalit√© d'ajout d'une liste
    //Liste ajouterListe(Liste liste);




}
