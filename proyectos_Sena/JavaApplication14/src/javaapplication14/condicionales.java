//mayor o menor de edad
package javaapplication14;
import java.util.*;
public class condicionales {
    public static void main(String[] args) {
        Scanner lol= new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nom=lol.nextLine();
        System.out.println("Escriba su edad sr(a)" +nom);
        byte e1= lol.nextByte();
        if (e1>=18) {
            System.out.println("sr(a) "+nom+" Eres mayor de edad");
        } else {
            System.out.println("sr(a) "+nom+ "Eres menor de edad" );
        }
    }
    
}
