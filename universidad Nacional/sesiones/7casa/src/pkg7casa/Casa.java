
package pkg7casa;

public class Casa {
    
    private int ventanas;
    String color;

    public Casa(int ventanas, String color) {
        this.ventanas = ventanas;
        this.color = color;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public static void main(String[] args) {
        
        Casa csai=new Casa(5, "rojo");
        System.out.println(csai);
    }
    
}
