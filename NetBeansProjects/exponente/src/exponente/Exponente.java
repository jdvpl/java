
package exponente;
import java.util.*;
public class Exponente {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner be=new Scanner(System.in);
        System.out.println("por favor digite la base");
        double base=be.nextDouble();
        System.out.println("por favor digite el exponente");
        double expo=be.nextDouble();
        System.out.println("la potencia es igual a: "+ Math.pow(base, expo));
    }
    
}


