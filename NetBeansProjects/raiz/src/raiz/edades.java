package raiz;
import java.util.*;
public class edades {
    public static void main(String[] args) {
       Scanner jaja=new Scanner(System.in);
        System.out.println("ingrese cuantos ciclos");
       int n=jaja.nextInt();
        for (int i = 1; i <=n; i++) {
         Scanner e=new Scanner(System.in);
        System.out.println("ingrese el primer nombre");
        String nom=e.nextLine();
        System.out.println("ingrese la edad de: "+nom);
        int e1=e.nextInt();
        System.out.println("ingrese el segundo nombre");
        String nom2=e.next();
        System.out.println("ingrese la edad de:" +nom2);
        int e2=e.nextInt();
        if (e1==e2) {
            System.out.println(nom+" y "+nom2+" tienen la misma edad");
        } else if (e1>e2) {
            System.out.println("el mayor es "+nom);
        } else {
            System.out.println("el mayor es "+nom2 );
        }
        }   
    }
}
