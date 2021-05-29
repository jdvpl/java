
package bucle;
import java.util.*;
public class for2 {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        System.out.println("digite desde que numero");
        int k=lol.nextInt();
        System.out.println("hasta que numero ");
        int s=lol.nextInt();
        System.out.println("de cuanto en cuanto");
        int p=lol.nextInt();
     
        for (int i = k; i <= s; i=i+p) {
            System.out.println(i);
        }
    }
}
