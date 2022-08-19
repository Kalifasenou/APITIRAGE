package com.APITirage.APITIRAGE.Repositories;

import com.APITirage.APITIRAGE.Modeles.Tirage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TirageRepository extends CrudRepository<Tirage,Long> {
    @Query(value = "SELECT * FROM postulant ORDER BY RAND() LIMIT :id", nativeQuery = true)
    Iterable<Object[]> tirerAleatoirement(long id);
}
