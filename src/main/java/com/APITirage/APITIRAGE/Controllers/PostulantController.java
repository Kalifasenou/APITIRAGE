package com.APITirage.APITIRAGE.Controllers;

import com.APITirage.APITIRAGE.Modeles.Excel;
import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Services.PostulantService;
//import com.APITirage.APITIRAGE.Services.TirageServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@Data @AllArgsConstructor
@RequestMapping("/postulants")
public class PostulantController {

    @Autowired
    private PostulantService postulantService;
    @PostMapping("/postulant")
    @ResponseBody
    public List<Postulant> list(@RequestParam("file") MultipartFile file){
        List<Postulant> postulants = Excel.postulantsExcel(file);


        for (Postulant p: postulants){
            postulantService.ajouter(p);
        }

        return Excel.postulantsExcel(file);
    }


   // @RestController
   // public static class TirageController {
     //   @Autowired
      //  TirageServiceImpl tirageServiceImpl;
      //  @GetMapping(value = "/tirer/{id}")
       // Iterable<Object[]> tirerAleatoirement(@PathVariable long id) {
        //    return tirageServiceImpl.tirerAleatoirement(id);
      //  }
   // }
}
