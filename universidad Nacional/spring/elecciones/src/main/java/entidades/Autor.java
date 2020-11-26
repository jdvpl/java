package entidades;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {
    @Id
    String email;
    String contrasena;
    String pseudonimo;
    String avatar;
    @OneToMany(mappedBy = "autor")
    Set<Publicacion> publicacions;

    public Autor(String email, String contrasena, String pseudonimo, String avatar, Set<Publicacion> publicacions) {
        this.email = email;
        this.contrasena = contrasena;
        this.pseudonimo = pseudonimo;
        this.avatar = avatar;
        this.publicacions = publicacions;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<Publicacion> getPublicacions() {
        return publicacions;
    }

    public void setPublicacions(Set<Publicacion> publicacions) {
        this.publicacions = publicacions;
    }

    @Override
    public String toString() {
        return "Autor{" + "email=" + email + ", contrasena=" + contrasena + ", pseudonimo=" + pseudonimo + ", avatar=" + avatar + ", publicacions=" + publicacions + '}';
    }
    
    
   
    
    
             
}
