package aleatorio;
import java.util.*;
public class Aleatorio {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hasta que numero quiere el aleatorio");
        Scanner pe=new Scanner(System.in);
        int lol=pe.nextInt();
        int numale;
        numale=(int)(Math.random()*lol);
        System.out.println("el numero aleatorio es: "+ numale);
    }
    
}
