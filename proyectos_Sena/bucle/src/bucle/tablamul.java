
package bucle;
import java.util.*;
public class tablamul {
    public static void main(String[] args) {
        Scanner lol= new Scanner(System.in);
        System.out.println("Digite el tipo de secuencia \n1. Ascendente \n2. desdente");
        int o=lol.nextInt();
        switch(o){
            case 1:
                System.out.println("Digite el valor inicial ");
                int in=lol.nextInt();
                 System.out.println("Digite el valor final ");
                int fi=lol.nextInt();
                 System.out.println("Digite el valor del incremento ");
                int inc=lol.nextInt();
                for (int i = in; i <=fi; i=i+inc) {
                    System.out.print(i+"  ");
                    
                }
                break;
             case 2:
                System.out.println("Digite el valor final ");
                int s=lol.nextInt();
                 System.out.println("Digite el valor inicial ");
                int fin=lol.nextInt();
                 System.out.println("Digite el valor del decremento ");
                int incr=lol.nextInt();
                for (int i = s; i >=fin; i=i-incr) {
                    System.out.print(i+"  ");
                    
                }
                break;
                
           
        }
    }
}
