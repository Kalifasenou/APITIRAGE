package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Postulant;

import java.util.List;

public interface PostulantService {
    // Fonctionnalité d'ajout d'un postulant ou des postulants
    Postulant ajouter (Postulant postulants);

    List<Postulant> lire();

}
