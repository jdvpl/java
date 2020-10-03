
package arreglos;
import java.util.*;
public class arreglopidiendo {
     public static void main(String[] args) {
         Scanner lol=new Scanner(System.in);
         System.out.println("cuantos numeros del arreglo quiere");
         int s=lol.nextInt();
          int[] valor=new int[s];
         for (int x = 0; x <s; x++) {
              System.out.println((x+1)+" digite el numero");
              valor[x]=lol.nextInt();
              
         }
         System.out.println("IMPRIMIENDO RESULTADOS");
        for (int i = 0; i <valor.length; i++) {
            
            System.out.println("el valor de la posicion "+i+" es: "+valor[i]);
        }
         
    }
}
