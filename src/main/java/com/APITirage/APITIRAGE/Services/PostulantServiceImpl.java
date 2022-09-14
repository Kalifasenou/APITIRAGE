package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Repositories.PostulantRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class PostulantServiceImpl implements PostulantService {
    private final PostulantRepository postulantRepository;

    @Override
    public Postulant ajouter(Postulant postulants) {
        return postulantRepository.save(postulants) ;
    }

    @Override
    public List<Postulant> TrouverIdPostList(long id_liste) {
        return postulantRepository.FINDIDPOSTLIST(id_liste);
    }

    @Override
    public void supprimerPostulant(Long id) {
        postulantRepository.deleteById(id);
    }

    @Override
    public List<Postulant> affiherPostulants() {
        return (List<Postulant>) postulantRepository.findAll();
    }

    //@Override
    public List<Postulant> lire() {
        return null;
    }

}
