package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Modeles.Tirage;

import java.util.List;

public interface TirageService {

    int nombreTirage();

    int nombreListeTiree();

    int listerNombreTirage(String nomliste);

    List<Postulant> creer(Tirage tirage,List<Postulant> listAtrier,long nbre);

    Tirage trouverTirageParLibelle(String libelletirage);
    List<Tirage> afficherTirage();
}
