
package hello;
import java.util.*;

public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite su nombre");
    Scanner   lol=new Scanner(System.in);
        String perro = lol.nextLine();
        System.out.println("Digite su edad");
        int e=lol.nextInt();
        System.out.println("Su nombre es: "+perro+" y su edad es: "+e);
    }
    
}
