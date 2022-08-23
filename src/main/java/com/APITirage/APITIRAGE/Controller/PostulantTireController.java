package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Modeles.PostulantTire;
import com.APITirage.APITIRAGE.Repositories.PostulantTireRepository;
import com.APITirage.APITIRAGE.Services.PostulantsTireService;
import com.APITirage.APITIRAGE.Services.PostulantsTireServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping("/tire")
public class PostulantTireController {
    @Autowired
    PostulantsTireServiceImpl postulantsTireServiceImpl;


    @GetMapping(value = "/afficherpostulanttire")
    public Iterable<PostulantTire> getPostulantTire(){
        return postulantsTireServiceImpl.lire();

    }

    @GetMapping(value = "/afficherpostulanttire/{libelletirage}")
    public Iterable<PostulantTire> getPostulantTire(@PathVariable String libelletirage){
        return postulantsTireServiceImpl.lirePostulantTireparnom(libelletirage);

    }

}
