package calculadora;
import java.util.*;
public class Calculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner num = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        float num1= num.nextInt();
        System.out.println("Digite el segundo numero");
        float num2=num.nextInt();
        //operaciones
        System.out.println("la suma es de: "+(num1+num2));
        System.out.println("la suma es de: "+(num1-num2));
        System.out.println("la suma es de: "+(num1*num2));
        System.out.println("la suma es de: "+(num1/num2));
    }
    
}
