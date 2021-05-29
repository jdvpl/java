package calculador;
import java.util.*;
public class salario {
     public static void main(String[] args) {
         Scanner datos = new Scanner(System.in);
            System.out.println("Por favor digite su nombre");
            String nombre = datos.nextLine();
            System.out.println("Por favor digite la cantidad de horas");
            int cantidad = datos.nextInt();
            System.out.println("Por favor digite el valor de la hora");
            int valor = datos.nextInt();
            int sueldo = cantidad * valor;

            System.out.println("Señor(a): " + nombre + " Su salario es: " + sueldo);

     }
}
