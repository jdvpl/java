
package javaapplication14;
import java.util.*;
public class par {
    public static void main(String[] args) {
       Scanner lol=new Scanner(System.in);
        System.out.println("Digite el numero 1");
       int num=lol.nextInt();
        if ((num%2==0)) {
            System.out.println("el numero "+num+" es par ");
        } else {
              System.out.println("el numero "+num+" es impar ");
        }
        
    }
}
