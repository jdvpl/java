package calculador;
import java.util.*;
public class edadynom {
    public static void main(String[] args) {
         //Creamos un objeto de tipo escaner
         Scanner datos = new Scanner(System.in);
         //Pedimos el nombre
         System.out.println("Escriba su nombre");
         //Capturamos el nombre
         String nombre = datos.nextLine();
         //Pedimos la edad
         System.out.println("Escriba su edad");
          //Capturamos la edad
          byte edad = datos.nextByte();
          // Realizamos la impresión de los datos
          System.out.println("su nombre es: " + nombre + " Tienes " + edad + " Años"); 


    }
    
}
