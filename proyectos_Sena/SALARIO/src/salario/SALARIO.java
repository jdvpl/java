package salario;

import java.util.*;
public class SALARIO {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos=new Scanner(System.in);
        System.out.println("porfavordigite su nombre");
        String nombre=datos.nextLine();
        System.out.println("por favor digite la cantidad de horas");
        int cantidad= datos.nextInt();
        System.out.println("valor por horas");
        int valor= datos.nextInt();
        int total=cantidad*valor;
        System.out.println("Señor(a) "+nombre+ " su salario es de: "+total);
        
    }
    
}
