package clases;

public class Carro {
  //Atributos de la clase
    String placa;
    String color;
    int x;
    int y;   
    
    //Constructor
    public Carro(String placa, String color, int x, int y){
        this.placa = placa;
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public Carro(String placaCarro, String colorCarro) {
        placa = placaCarro;
        color = colorCarro;
    }
    
    public Carro(){
    
    }
    
    //Metodos
    public void mover(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void ubicar(){
        System.out.println("Hola soy el carro " + this.placa);
        System.out.println("Estoy en " + this.x + ", " + this.y);
    }
    
    
}
