package bucle;
import java.util.*;
public class vacacional {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        System.out.println("Digite el nombre del trabajador");
        String nom= lol.nextLine();
        System.out.println("Digite los años trabajados");
        int hor=lol.nextInt();
        System.out.println("Digite la clave siendo \n1. \n2. \n3.");
        int cla=lol.nextInt();
        switch (cla) {
            case 1:
                System.out.println("sr(a) "+nom+" ya que has trabajado "+hor+ " horas, tendras vaciones de 5 dias");
                break;
            case 2:
                System.out.println("sr(a) "+nom+" ya que has trabajado "+hor+ " horas,tendras vaciones de 7 dias");
                break;
            case 3:
                System.out.println("sr(a) "+nom+" ya que has trabajado "+hor+ " horas, tendras vaciones de 10 dias");
                break;
            default:
                System.out.println("no has digitado la clave correcta");
        }
    }
}
