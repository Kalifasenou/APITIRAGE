package com.APITirage.APITIRAGE.Repositories;

import com.APITirage.APITIRAGE.Modeles.Postulant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostulantRepository extends CrudRepository<Postulant,Long> {

    @Query(value = "SELECT * FROM postulant where id_liste=:id_liste",nativeQuery = true)
    public List<Postulant>FINDIDPOSTLIST(@Param("id_liste") long id_liste);
}
