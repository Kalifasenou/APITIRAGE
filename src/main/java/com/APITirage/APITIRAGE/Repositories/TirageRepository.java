package com.APITirage.APITIRAGE.Repositories;


import com.APITirage.APITIRAGE.Modeles.Tirage;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface TirageRepository extends JpaRepository <Tirage, Long>{
    //@Query(value = "SELECT * FROM postulant ORDER BY RAND() LIMIT :id", nativeQuery = true)
   // Iterable<Object[]> tirerAleatoirement(long id);
    Tirage findBylibelletirage(String libelletirage);


}
