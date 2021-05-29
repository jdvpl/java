package bucle;
import java.util.*;
public class decre {
    public static void main(String[] args) {
        Scanner lol= new Scanner(System.in);
        System.out.println("Digite el valor final");
        int fin=lol.nextInt();
        System.out.println("Digite le valor inicial");
        int ini=lol.nextInt();
        System.out.println("Digite el decrmento");
        int dec=lol.nextInt();
        for (int i = fin; i >= ini; i-=dec) {
            System.out.print(i+"  ");
        }
        System.out.println("\n");
        while (fin>=ini) {
            System.out.print(fin+"  ");
            fin-=dec;
        }
    }
}
