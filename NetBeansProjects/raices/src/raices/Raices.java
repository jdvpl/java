package raices;
import java.util.*;
import java.text.DecimalFormat;
public class Raices {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("cuantos ciclos quiere");
        Scanner x=new Scanner(System.in);
        int l=x.nextInt();
        for (int i = 0; i <=l; i++) {
        System.out.println("escribe un numero");
        Scanner jeje=new Scanner(System.in);
        double ele=jeje.nextDouble();
        double num=ele;
        double raiz=Math.sqrt(num);
        System.out.println("la raíz cuadrada de "+ele+" es: "+raiz);
        //indicando la cantidad de decimales
        DecimalFormat df= new DecimalFormat("#.00");
        System.out.println("la raiz cuadrada de "+ele+" es:" +df.format(raiz));
        //usando la clase string format
        System.out.println("la raiz cuadrada de "+ele+" es: "+String.format("%.3f", raiz) );
        
        }
    }
    
}
