
package entidades;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Publicacion {
       @Id
       String titulo;
       String resumen;
       String contenido;
       String foto;
       int votos;
       Date fecha;
       @ManyToOne
       @JoinColumn(name = "autor_id")
       Autor autor;

    public Publicacion(String titulo, String resumen, String contenido, String foto, int votos, Date fecha, Autor autor) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.contenido = contenido;
        this.foto = foto;
        this.votos = votos;
        this.fecha = fecha;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", resumen=" + resumen + ", contenido=" + contenido + ", foto=" + foto + ", votos=" + votos + ", fecha=" + fecha + ", autor=" + autor + '}';
    }
       
    
       
}
