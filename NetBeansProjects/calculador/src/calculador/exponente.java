package calculador;
import java.util.*;
public class exponente {
    public static void main(String[] args) {
        System.out.println("---- CALCULAR LA POTENCIA DE UN NUMERO ----");
            Scanner be = new Scanner(System.in);
            System.out.println("Por favor digite la base");
            double base = be.nextDouble();
            System.out.println("Por favor digite el exponente");
            double expo = be.nextDouble();
            System.out.println("la potencia es igual a: " + Math.pow(base, expo)); 

    }
}
