package com.APITirage.APITIRAGE.Repositories;


import com.APITirage.APITIRAGE.Modeles.Tirage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TirageRepository extends JpaRepository <Tirage, Long>{
    @Query(value = "SELECT DISTINCT t.id_liste FROM liste l,tirage t WHERE l.id = t.id_liste;", nativeQuery = true)
    List<Object> nombreListeTiree();
    Tirage findBylibelletirage(String libelletirage);
    @Query(value = "Select tirage.libelletirage from tirage,liste WHERE tirage.id_liste=liste.id AND liste.libelleliste=?;",nativeQuery = true)
    List<Object> tirageParListe(String nomliste);


}
