package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Services.PostulantsTireService;
import com.APITirage.APITIRAGE.Services.PostulantsTireServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping("/tire")
public class PostulantTireController {
    @Autowired

    private final PostulantsTireService postulantsTireService;
    @GetMapping(value = "/afficherpostulanttire")
    public int create(long id, String nom, String prenom, String numero, String email, long id_tirage){
        return postulantsTireService.creer(id,nom,prenom,numero,email,id_tirage);

    }
}
