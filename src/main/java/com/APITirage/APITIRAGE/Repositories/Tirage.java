package com.APITirage.APITIRAGE.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Tirage extends JpaRepository<Tirage,Long> {
}
