
package ejerciciosoperadores;

import java.util.*;

public class Ejerciciosoperadores {

    public static void main(String[] args) {
          Double suma = 0.0;
        Double divi=1.0;
         System.out.println("Digite su nombre");
    Scanner   lol=new Scanner(System.in);
    String Nom = lol.nextLine();
        for (int i = 0; i <5 ; i++) {
             System.out.println("Digite  notas");
             Scanner   l=new Scanner(System.in);
        Double x= lol.nextDouble();
        suma=suma+x;
        }
        divi=suma/5;
        System.out.println("el resultado es: "+divi);
    }
    
}
