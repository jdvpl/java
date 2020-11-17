
public class Comercial extends Vehiculo{
    protected int carga;

    public Comercial( int Velocidad, int Pajajeros, String Placa, String Tipo,int carga) {
        super(Velocidad, Pajajeros, Placa, Tipo);
        this.carga = carga;
    }
    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
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
    
    @Override
    public String toString() {
        String datos="\tVehìculo Comercial - Placa: "+getPlaca()+"\n";
        datos+="\tVelocidad: "+getVelocidad()+" km/h\n";
        datos+="\tPasajeros: "+getPajajeros()+"\n";
        datos+="\tCarga máxima: "+getCarga()+"Kg";
        return datos;
    }
    
}
