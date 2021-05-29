
package bucle;
import java.util.*;
public class comparar {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        System.out.println("Digite el nombre 1");
        String nom=lol.nextLine();
        System.out.println("Digite el nombre 2");
        String nom1=lol.next();
        if (nom.equalsIgnoreCase(nom1)) {
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("los nombres son diferentes");
        }
        
    }
    
}
