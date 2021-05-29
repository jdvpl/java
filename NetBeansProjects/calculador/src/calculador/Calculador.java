
package calculador;
import java.util.*;
public class Calculador {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner num = new Scanner(System.in);
        System.out.println("Digite el primer número");
          int num1 = num.nextInt();
          System.out.println("Digite el Segundo número");
          int num2 = num.nextInt();
          System.out.println("La suma es de: " + (num1+num2));
          System.out.println("La resta es de: " + (num1-num2));
          System.out.println("La multiplicación es de: " + (num1*num2));
          System.out.println("La división es de: " + (num1/num2));


    }
    
}
