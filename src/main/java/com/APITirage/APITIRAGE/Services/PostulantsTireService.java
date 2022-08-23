package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.PostulantTire;

public interface PostulantsTireService {

    //Fonctionnalité d'affichage
    //public Object afficher();
    int creer(long id, String nom,String prenom,String numero, String email, long id_tirage);

    public Iterable<PostulantTire> lirePostulantTireparnom(String libelletirage);
}
