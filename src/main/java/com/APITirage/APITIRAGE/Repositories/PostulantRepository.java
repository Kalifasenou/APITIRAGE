package com.APITirage.APITIRAGE.Repositories;

import com.APITirage.APITIRAGE.Modeles.Postulant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PostulantRepository extends JpaRepository<Postulant,Long> {
}
