package com.APITirage.APITIRAGE.Services;


import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Modeles.Tirage;
import com.APITirage.APITIRAGE.Repositories.TirageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class TirageServiceImpl implements TirageService{


     private  TirageRepository tirageRepository;

    @Override
    public int nombreTirage() {
        List<Tirage> tirages = tirageRepository.findAll();
        return tirages.size();
    }

    @Override
    public int nombreListeTiree() {
        List<Object> listetire = tirageRepository.nombreListeTiree();
        return listetire.size();
    }

    @Override
    public int listerNombreTirage(String nomliste) {
        return tirageRepository.tirageParListe(nomliste).size();
    }

    @Override
    public List<Object> toutTirage(Long id_liste) {
        return tirageRepository.tout(id_liste);
    }

    @Override
    public List<Postulant> creer(Tirage tirage, List<Postulant> listAtrier, long nbre) {

        Random rand = new Random();

        List<Postulant> list = new ArrayList<>();

        for (int i=0; i<nbre;i++)
        {
            Integer idAct = rand.nextInt(listAtrier.size());

            list.add(listAtrier.get(idAct));

            listAtrier.remove(listAtrier.get(idAct));

        }
        tirage.setDateTirage(new Date());
        tirageRepository.save(tirage);
        return list;
    }

    @Override
    public Tirage trouverTirageParLibelle(String libelleliste) {
         return tirageRepository.findBylibelletirage(libelleliste);
    }

    @Override
    public List<Tirage> afficherTirage() {
        return tirageRepository.findAll();
    }

    @Override
    public List<Object> nombreTirageparListe() {
        return tirageRepository.nombreTirageparListe();
    }
}
