package com.APITirage.APITIRAGE.Repositories;

import com.APITirage.APITIRAGE.Modeles.PostulantTire;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface PostulantTireRepository extends CrudRepository<PostulantTire,Long> {
    @Modifying
    @Transactional
    @Query(value="INSERT INTO PostulantTire(id,nom,prenom,numero,email,id_tirage)VALUES(?,?,?,?,?,?);",nativeQuery = true)
    public int INSERTPOSTTIRE(long id,String nom,String prenom,String numero,String email, long id_tirage);

}
