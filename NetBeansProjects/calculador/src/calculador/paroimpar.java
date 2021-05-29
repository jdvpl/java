
package calculador;
import java.util.*;

public class paroimpar {
    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);
        System.out.println("Por favor digite el Número 1");
        int num1 = par.nextInt();
        if (num1%2==0) {
            System.out.println("El número " + num1 + " Es Par");
        }else{
             System.out.println("El número " + num1 + " Es  Impar");

        }
    }
    
}
