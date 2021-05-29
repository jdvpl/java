package bucle;
import java.util.*;
public class ciclo1 {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        System.out.println("Digite el valor inicial");
        int ini=lol.nextInt();
        System.out.println("Digita el valor Final");
        int fin=lol.nextInt();
        System.out.println("Digite el incremento");
        int inc=lol.nextInt(); 
        System.out.println("\n");
        for (int j= ini; j <= fin; j+=inc) {
            System.out.print(j+"  ");
        }
        System.out.println("\n");
         while (ini<=fin) {
            System.out.print(ini+"  ");
            ini+=inc;
        }
    }
}
