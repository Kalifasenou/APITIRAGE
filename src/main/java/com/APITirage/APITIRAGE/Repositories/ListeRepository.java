package com.APITirage.APITIRAGE.Repositories;

import com.APITirage.APITIRAGE.Modeles.Liste;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ListeRepository extends CrudRepository<Liste,Long> {
    Liste findBylibelleliste(String libelleliste);

    @Modifying
    @Transactional
    @Query(value = "INSERT into postulant(id_liste)values(:id_liste);",nativeQuery = true)
    public int INSERTIDLIST(@Param("id_liste") long id_liste);
    @Query(value = "Select liste.libelleliste from liste;",nativeQuery = true)
    List<Object> afficherNomListe();
    @Query(value = "SELECT DISTINCT liste.* FROM liste, tirage WHERE liste.id=tirage.id_liste;",nativeQuery = true)
    List<Liste> trouverListeTiree();
    @Query(value = "Select * from liste where liste.id=?;",nativeQuery = true)
    Liste afficherNom(long idliste);
}
