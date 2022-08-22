package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.PostulantTire;
import com.APITirage.APITIRAGE.Repositories.PostulantTireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PostulantsTireServiceImpl implements PostulantsTireService{
    @Autowired
    PostulantTireRepository postulantTireRepository;

    @Override
    public int creer(long id, String nom, String prenom, String numero, String email, long id_tirage) {
        return postulantTireRepository.INSERTPOSTTIRE(id,nom,prenom,numero,email,id_tirage);
    }

    @Override
    public Iterable<PostulantTire> lirePostulantTireparnom(String libelletirage) {
        return postulantTireRepository.lirePostulantTireparnom(libelletirage);
    }

    public Iterable<PostulantTire> lire() {
        return postulantTireRepository.findAll();
    }


}
