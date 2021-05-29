
package com.jdvpl.jdvpl.repositorios;

import com.jdvpl.jdvpl.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juand
 */
@Repository
public interface RepAutor extends JpaRepository<Autor, Integer>{
    
}
