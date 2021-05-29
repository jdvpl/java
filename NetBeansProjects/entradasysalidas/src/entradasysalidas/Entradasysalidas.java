
package entradasysalidas;
import java.util.*;
public class Entradasysalidas {

    public static void main(String[] args) {
        // TODO code application logic here
        //creamos un objeto tipo scanner
        Scanner datos= new Scanner(System.in);
        System.out.println("escriba su nombre");
        
        //capturamos el nombre
        
        String nombre = datos.nextLine();
        System.out.println("escriba su edad");
        //pedimos la edad
        byte edad = datos.nextByte();
        //realizamos la impresion de los datos
        System.out.println("su nombre es "+nombre+ ", su edad es de: "+edad);
        
        
        try{
            int uno=4/0;
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
