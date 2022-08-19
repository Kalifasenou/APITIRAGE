package com.APITirage.APITIRAGE.Repositories;

import com.APITirage.APITIRAGE.Modeles.Postulant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostulantRepository extends CrudRepository<Postulant,Long> {
    @Query(value = "INSERT INTO postulant(email, nom, numero, prenom, id_liste) values(:email, :nom, :numero, :prenom, :id_liste)", nativeQuery = true)
    Iterable<Object[]> save();
}
