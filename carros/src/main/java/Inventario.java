
import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {
 

    public static void main(String[] args) {
        
        
        
        ArrayList<Vehiculo> almacen;
        almacen=new ArrayList<Vehiculo>();
        while (true) { 
            Scanner sc = new Scanner(System.in);
            String comando = sc.nextLine();
            String[] datos = comando.split("\\&");
            String opcion = datos[0];
            
            if (opcion.equals("1")) {
                String tipo = datos[1];
                if (tipo.equals("Comercial")) {
                    int vel = Integer.parseInt(datos[3]);
                    int pas = Integer.parseInt(datos[2]);
                    String pla = datos[4];
                    int carga = Integer.parseInt(datos[5]);

                    Vehiculo hv = new Comercial(vel, pas, pla, "Comercial", carga);
                    almacen.add(hv);
                } else if (tipo.equals("Particular")) {
                    int vel = Integer.parseInt(datos[3]);
                    int pas = Integer.parseInt(datos[2]);
                    String pla = datos[4];
                    String color = datos[5];

                    Vehiculo pa = new Particular(vel, pas, pla, "Particular", color);
                    almacen.add(pa);

                }
            } else if (opcion.equals("2")) {
                System.out.println("***Inventario de Vehìculos***");
                for (int i = 0; i < almacen.size(); i++) {
                    System.out.println(almacen.get(i));
                }
            } else if(opcion.equals("4")){
                
        }
        


        }
         
        
        
    }
    
    
}
