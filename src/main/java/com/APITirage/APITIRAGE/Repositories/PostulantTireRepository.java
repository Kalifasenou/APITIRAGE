package com.APITirage.APITIRAGE.Repositories;

import com.APITirage.APITIRAGE.Modeles.Postulant;
import com.APITirage.APITIRAGE.Modeles.PostulantTire;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface PostulantTireRepository extends CrudRepository<PostulantTire,Long> {
    @Modifying
    @Transactional
    @Query(value="INSERT INTO postulanttire(id,nom,prenom,numero,email,id_tirage)VALUES(?,?,?,?,?,?);",nativeQuery = true)
    public int INSERTPOSTTIRE(long id,String nom,String prenom,String numero,String email, long id_tirage);

    @Query(value = "SELECT * FROM postulanttire,tirage WHERE tirage.id=postulanttire.id_tirage and tirage.libelletirage=:libelletirage",nativeQuery = true)
    public Iterable<PostulantTire> lirePostulantTireparnom(String libelletirage);


}
