
package modelo;

public class Comentario {
    private String Nombre;
    private  String Comentario;

    public Comentario(String Nombre, String Comentario) {
        this.Nombre = Nombre;
        this.Comentario = Comentario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }
    
    
}
