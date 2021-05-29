

package raiz;
import java.util.*;
public class Raiz {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n2=new Scanner(System.in);
        System.out.println("cuantas numeros");
        int n22=n2.nextInt();
        for(int x=1;x<=n22;x++){
                
        Scanner raiz= new Scanner(System.in);
        System.out.println("por favor digite un numero");
        double numero= raiz.nextDouble();
        //impresion y operacion
        System.out.println("la raiz cuadrada es:" + Math.sqrt(numero));
        }
    }
    
}
