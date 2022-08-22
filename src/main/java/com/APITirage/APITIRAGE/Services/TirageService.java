package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Modeles.Tirage;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TirageService {

    List<Postulant> creer(Tirage tirage,List<Postulant> listAtrier,long nbre);

    Tirage trouverTirageParLibelle(String libelletirage);
}
