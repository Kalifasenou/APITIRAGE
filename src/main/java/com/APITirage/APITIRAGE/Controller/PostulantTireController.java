package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Services.PostulantsTireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostulantTireController {
    @Autowired
    PostulantsTireServiceImpl postulantsTireService;
    @GetMapping(value = "/afficherpostulanttire")
    public Object afficherPostulantTire() {
        return postulantsTireService.afficher();
    }
}
