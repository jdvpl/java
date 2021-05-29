
package casos;
import java.util.*;
public class Casos {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lol= new Scanner(System.in);
        System.out.println("Digite un dia de la semana");
        byte dia=lol.nextByte();
        switch(dia){
            case 1:
                    System.out.println("Es lunes");
                    break;
            case 2:
                System.out.println("Es martes");
                break;
             case 3:
                System.out.println("Es miercoles");
                break;
             case 4:
                System.out.println("Es jueves");
                break;
             case 5:
                System.out.println("Es viernes");
                break;
              case 6:
                System.out.println("Es sabado");
                break;
             case 7:
                System.out.println("Es domingo");
                break;
             default: System.out.println("no es ningun dia de la semana rectifique bien");
        }
    }
    
} 
