package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Postulant;

import com.APITirage.APITIRAGE.Repositories.PostulantRepository;
import com.APITirage.APITIRAGE.Repositories.PostulantTireRepository;
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
    public List<Postulant> lire() {
        return null;
    }
}
