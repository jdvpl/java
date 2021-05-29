
package pkg3carros;

public class Vehiculo {
    private int Velocidad;
    private int Pasajeros;
    private String Placa;
    private String Tipo;

    public Vehiculo(int Velocidad, int Pasajeros, String Placa, String Tipo) {
        this.Velocidad = Velocidad;
        this.Pasajeros = Pasajeros;
        this.Placa = Placa;
        this.Tipo = Tipo;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
