//el almacen don baraton ofrece un descuento del 35% a sus cliente  por las compras de mas de 20000. El  programa debe  pedir el nombre del cleinte,
// el valor de la compra e imprimir el nombre, el desciento y total a pagar
package javaapplication14;
import java.util.*;
public class prendas {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("******TIENDA DON BARATON******");
         System.out.println("-----------------------------------");
        System.out.println("Digite el nombre del cliente");
        String nom=lol.nextLine();
        System.out.println("Digite el valor de la compra");
        int val=lol.nextInt();
        double des;
        double tota;
        if (val>20000) {
             des=val*0.35;
           tota=val-des;
            System.out.print("sr(a) "+nom+" el descuento por haber comprado "+val+" es de:" );
            System.out.printf("%1.2f",des);
            System.out.print( " entonces tendras que pagar "+tota);
        } else {
             des=0;
           tota=val-des;
           
            System.out.println("sr(a) "+nom+" el descuento por haber comprado "+val+" es de: " +des+ " osea tendras que pagar "+tota);
        }
    }
}
