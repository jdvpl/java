
package operaciones;
import java.util.*;
public class Operaciones {

    public static void main(String[] args) {
    System.out.println("----<<PROGRAMA QUE LE IMPRIMA LOS NUMEROS HASTA EL QUE UNO QUIERA>>---");
    Scanner lol= new Scanner(System.in);
      System.out.println("por favor digite cuantos ciclos quiere");
      int jeje=lol.nextInt();
        for (int x = 0; x <jeje; x++) {  
    Scanner s=new Scanner(System.in);
        System.out.println("\n digite hasta que numero quiere el ciclo");
    int num=s.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+", ");
       }
    }               
  }
}
