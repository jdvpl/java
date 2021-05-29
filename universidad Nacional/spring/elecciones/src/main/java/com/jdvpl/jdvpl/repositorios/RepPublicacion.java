
package com.jdvpl.jdvpl.repositorios;

import com.jdvpl.jdvpl.entidades.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepPublicacion extends JpaRepository<Publicacion, Integer>{
    
}
