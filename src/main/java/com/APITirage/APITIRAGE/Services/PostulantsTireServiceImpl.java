package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Repositories.PostulantTireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostulantsTireServiceImpl implements PostulantsTireService{
    @Autowired
    PostulantTireRepository postulantTireRepository;
    @Override
    public Object afficher() {
        return postulantTireRepository.findAll();
    }
}