package com.APITirage.APITIRAGE.Services;


import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Modeles.Tirage;
import com.APITirage.APITIRAGE.Repositories.TirageRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class TirageServiceImpl implements TirageService{


     private  final TirageRepository tirageRepository;
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
        tirageRepository.save(tirage);
        return list;
    }

    @Override
    public Tirage trouverTirageParLibelle(String libelleliste) {
         return tirageRepository.findBylibelletirage(libelleliste);
    }
}
