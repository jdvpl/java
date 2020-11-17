
public abstract class Vehiculo {
    protected int Velocidad;
    protected int Pajajeros;
    protected String Placa;
    protected String Tipo;

    public Vehiculo(int Velocidad, int Pajajeros, String Placa, String Tipo) {
        this.Velocidad = Velocidad;
        this.Pajajeros = Pajajeros;
        this.Placa = Placa;
        this.Tipo = Tipo;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getPajajeros() {
        return Pajajeros;
    }

    public void setPajajeros(int Pajajeros) {
        this.Pajajeros = Pajajeros;
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
    
 
    public abstract String toString();
    
    
}
