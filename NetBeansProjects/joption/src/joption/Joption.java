package joption;
import javax.swing.*;
public class Joption {

    public static void main(String[] args) {
    
        int g=-1;
     while(g<0){
         String nombre=JOptionPane.showInputDialog("Por favor digite su nombre");
         if (nombre.length()>0){
             g--;
             System.out.println("gracias "+nombre) ;
         }else{
             System.out.println("por favor digite su nombre!");
         }
     }
    
    }
    
}
