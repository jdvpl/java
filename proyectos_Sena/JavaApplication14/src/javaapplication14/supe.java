//el supermercado don pecho hace un descuento de el 25% a quellos cliente que compre 50000 o mas.
//pedir el nombre, el valor de la compra. imprimir el nombre, el descuento y el total a pagar

package javaapplication14;
import java.util.*;
public class supe {
    public static void main(String[] args) {
        Scanner lol= new Scanner(System.in);
        System.out.println("digite su nombre");
        String nom=lol.nextLine();
        System.out.println("Digite el valor de lacompra");
        int com=lol.nextInt();
        double des;
        if (com>=50000) {
            des=com-(com*0.25);
            System.out.println("Sr(a) "+nom+ " su descuento de la compra "+com+" "
                    + " es de "+(des*0.25)+ " y el valor a pagar es: "+des);
        } else {
            des=com-(com*0);
            System.out.println("Sr(a) "+nom+ " su descuento de la compra "+com+" "
                    + " es de "+(des*0)+ " y el valor a pagar es: "+des);
        }
    }
}
