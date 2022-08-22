package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Repositories.PostulantTireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostulantsTireServiceImpl implements PostulantsTireService{
    @Autowired
    PostulantTireRepository postulantTireRepository;

    @Override
    public int creer(long id, String nom, String prenom, String numero, String email, long id_tirage) {
        return postulantTireRepository.INSERTPOSTTIRE(id,nom,prenom,numero,email,id_tirage);
    }
}
