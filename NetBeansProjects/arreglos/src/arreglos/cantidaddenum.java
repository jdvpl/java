
package arreglos;
import java.util.*;
public class cantidaddenum {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        System.out.println("digite la cantidad");
        int val=lol.nextInt();
        int[] valor=new int[val];
        for (int i = 0; i <val; i++) {
            System.out.println("digite el numero N° "+(i+1));
            valor[i]=lol.nextInt();
        }
        //imprimimos los datos
        for (int x = 0; x < valor.length; x++) {
            System.out.println("en la posicion "+x+" esta el N° "+valor[x]);
            
        }
    }
}
