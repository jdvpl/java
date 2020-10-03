package arreglos;
import java.util.*;
import javax.swing.*;
public class arreglopiletra {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        int valor;
        System.out.println("digite el numero de frutas");
        valor =lol.nextInt();
      // valor = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
        String[] letras=new String[valor];
        System.out.println("digite los elementos del arreglo");
        for (int i = 0; i < valor; i++) {
            System.out.println((i+1)+"digite el caracter");
            letras[i]=lol.next();
            
        }//imprimiendo los valores
        System.out.println("los caracteres del arreglo son:");
        for (int i = 0; i < letras.length; i++) {
            System.out.println("en la posicion "+i+" es: "+letras[i]);
            
        }
    }
}
