
package arreglos;
import java.util.*;
public class Arreglos {
    public static void main(String[] args) {
        // declaramos el arreglo
        int[] num= new int[3]; 
        //asignando los valores del arreglo
        num[0]=23;
        num[1]=99;
        num[2]=-20;
        //imprimiendo los valores
        System.out.println("el valor que escogiste es: " +num[2]);
        //otra forma de impresion
        for (int i = 0; i < 3; i++) {
            System.out.println("la posicion "+i+" es "+num[i]);
        }
    }
    
}
