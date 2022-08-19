package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Liste;

import java.util.List;

public interface ListeService {


    Iterable<Liste> afficherListe();

    //Fonctionnalité de suppression d'un ou plusieurs liste(s)
    String supprimerListe (long id);

    //Fonctionnalité de modification de liste
    Liste modifierListe(Liste liste);

    //Fonctionnalité d'ajout d'une liste
    Liste ajouterListe(Liste liste);




}
