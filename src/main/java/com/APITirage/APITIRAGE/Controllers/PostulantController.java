package com.APITirage.APITIRAGE.Controllers;

import com.APITirage.APITIRAGE.Modeles.Excel;
import com.APITirage.APITIRAGE.Modeles.Liste;
import com.APITirage.APITIRAGE.Modeles.Postulant;

import com.APITirage.APITIRAGE.Repositories.PostulantRepository;
import com.APITirage.APITIRAGE.Services.ListeService;
import com.APITirage.APITIRAGE.Services.PostulantService;
import com.APITirage.APITIRAGE.Services.PostulantServiceImpl;

import com.APITirage.APITIRAGE.Services.PostulantService;
//import com.APITirage.APITIRAGE.Services.TirageServiceImpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Controller
@Data @AllArgsConstructor
@RequestMapping("/postulants")
public class PostulantController {

    @Autowired
    private PostulantService postulantService;
    private ListeService listeService;
    @PostMapping("/postulant/{libelleliste}")
    @ResponseBody
    public List<Postulant> list(@RequestParam("file") MultipartFile file,Liste liste,String libelleliste){
        List<Postulant> postulants = Excel.postulantsExcel(file);

         liste.setDateliste(new Date());
         Liste l = listeService.CreerListe(liste);
        for (Postulant p: postulants){
            p.setListe(l);
            postulantService.ajouter(p);
        }

        return Excel.postulantsExcel(file);
    }



}
