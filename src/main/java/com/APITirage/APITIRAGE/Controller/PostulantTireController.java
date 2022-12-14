package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Modeles.PostulantTire;
import com.APITirage.APITIRAGE.Services.PostulantsTireServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Data
@RequestMapping("/tire")
@CrossOrigin(origins = "http://localhost:4200")

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
