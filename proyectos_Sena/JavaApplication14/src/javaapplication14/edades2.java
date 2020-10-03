
package javaapplication14;
import java.util.*;
public class edades2 {
    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nom=lol.nextLine();
        System.out.println("Digite la edad sr(a)"+nom);
        byte e=lol.nextByte();
        if (e<=18) {
            System.out.println(nom+" eres un niño(a) jilipollas");
        } else if (e<40) {
            System.out.println(nom+" eres un adulto jilipollas");
        }else if (e<60){
            System.out.println( nom +" eres un anciano");
        }else{
            System.out.println("Estas viviendo horas extras");
        }
    }
}
