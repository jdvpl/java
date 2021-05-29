
package com.jdvpl.jdvpl;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.jdvpl.jdvpl.repositorios.RepAutor;

@Component
public class MainSpring implements CommandLineRunner{
    
    @Autowired
    RepAutor autor;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(autor.count());
    }
    
}
