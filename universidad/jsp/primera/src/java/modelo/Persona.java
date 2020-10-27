package modelo;
public class Persona {
    private String nombre;
    private String apellido;
    private String pais;
    private String ciudad;
    private int edad;
    private String descripcion;

    public Persona(String nombre, String apellido, String pais, String ciudad, int edad,String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.ciudad = ciudad;
        this.edad = edad;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
