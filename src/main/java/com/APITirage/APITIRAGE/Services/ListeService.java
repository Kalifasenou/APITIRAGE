package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Modeles.Postulant;

import java.util.List;

public interface ListeService {

    //Fonctionnalité d'affichage d'une liste
    List afficher ();

    //Fonctionnalité de suppression d'un ou plusieurs liste(s)
    Liste supprimer (Long id);

    //Fonctionnalité de modification de liste
    Liste modifier (Long id, Liste liste);

    //Fonctionnalité d'ajout d'une liste
    Liste ajouter (Liste liste);




}
