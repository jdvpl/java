
package raices;
import java.util.*;
public class raicesenesimas {
     public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("------<<PROGRAMA QUE CALCULA LA RAIZ ENESIMA>>---");
         
         System.out.println("por favor digite cuanto numeros quiere");
         Scanner pe=new Scanner(System.in);
         int x=pe.nextInt();
         for (int i = 0; i <= x; i++) {  
        Scanner be=new Scanner(System.in);
        System.out.println("por favor digite la raiz enesima");
        double expo=be.nextDouble();
        System.out.println("por favor digite la raiz a calcular");
         Scanner s=new Scanner(System.in);
         double num=s.nextDouble();
         double resultado=(double)Math.pow(num,1/ expo);
        System.out.println("la potencia es igual a: " + resultado);
    }
}
     }
