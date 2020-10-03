package proyecto;
import java.util.*;
public class getters {
    public static void main(String[] args) {      
        System.out.println("-----<<programa que multiplica dos numeros>>---");  
        Scanner s=new Scanner(System.in);
                
        System.out.println("cuantos numeros quiere");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            Scanner lol = new Scanner(System.in);
            System.out.println("por favor digite el primer numero");
            int num1 = lol.nextInt();
            System.out.println("por favor digite el segundo numero");
            int num2 = lol.nextInt();
            System.out.println("el resultado de la multiplicacion de: " + num1 + " x " + num2 + " =" + (num1 * num2));
        }

}
}

