
package javaapplication14;

import java.util.*;
public class JavaApplication14 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner chaq=new Scanner(System.in);
        System.out.println("por favor indique la cantidad de chaquetas");
        int cantidad= chaq.nextInt();
        System.out.println("por favor indique el valor de la chaqueta");
        int valor= chaq.nextInt();
        if (cantidad>5) {
            double precio= (cantidad*valor);
            double descu=precio*0.20;
            double total=precio-descu;
            System.out.println("el precio inicial es: "+precio+" el desciento es de: "+descu+" el total a pagar es de: "+total);
            
        } else {
            double precio= (cantidad*valor);
            double descu=0;
            double total=precio-descu;
            System.out.println("el precio inicial es: "+precio+
                    " el desciento es de: "+descu+
                    " el total a pagar es de: "+total);
        }
    }
    
}
