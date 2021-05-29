
package casos;
import java.util.*;
import javax.swing.*;
public class areas {
    public static void main(String[] args) {
        Scanner lol= new Scanner(System.in);
        System.out.println("Elige un Opcion: \n1. Cuadrado \n2. Rectangulo"
                + "\n3. Triangulo \n4. Circulo \n5. Cubo");
        int figura= lol.nextInt();
        switch(figura){
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                System.out.println("El area del cuadrado es: "+Math.pow(lado, 2));
                 break;
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
                System.out.println("El area del rectangulo es: "+base*altura);
                break;
            case 3:
                 base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                 altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
                 System.out.println("El area del Triangulo es: "+(base*altura)/2);
                 break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("introduce el Radio"));
                System.out.print("El area del circulo es: ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                break;
            case 5:
                lado= Integer.parseInt(JOptionPane.showInputDialog("intrdoduce el valor de uno de sus lados"));
                System.out.println("EL volumer del cubo es: "+Math.pow(lado, 3));
                
            default:
                System.out.println("La opcion es incorecta");
        }      
        
        
    }
}
