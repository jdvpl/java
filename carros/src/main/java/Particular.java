
public class Particular extends Vehiculo{
    
    private String Color;

    public Particular(int Velocidad, int Pajajeros, String Placa, String Tipo,String Color) {
        super(Velocidad, Pajajeros, Placa, Tipo);
        this.Color = Color;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
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
        String datos="\tVehìculo Particular - Placa: "+getPlaca()+"\n";
        datos+="\tVelocidad: "+getVelocidad()+" km/h\n";
        datos+="\tPasajeros: "+getPajajeros()+"\n";
        datos+="\tColor: "+getColor();
        return datos;
        
    }

   
}
