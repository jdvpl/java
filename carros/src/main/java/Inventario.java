
import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {
 

    public static void main(String[] args) {
        
        
        
        ArrayList<Vehiculo> almacen;
        almacen=new ArrayList<Vehiculo>();
        Scanner sc = new Scanner(System.in);
        int particulares=100;
        int comerciales=100;
        while (true) { 
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
            } else if(opcion.equals("3")){
//                3&Particular&190&Comercial&1&1022734737
                int cantidadParticular=Integer.parseInt(datos[2]);
                int cantidadComercial=Integer.parseInt(datos[4]);
                if(cantidadParticular>particulares || cantidadComercial>comerciales){
                    System.out.println("Lo sentimos no tenemos stock suficiente");
                }else{
                    int cedula=Integer.parseInt(datos[5]);
                    int precioComercial=40000000;
                    int precioParticular=30000000;
                    
                    int totalcarros=cantidadComercial+cantidadParticular;
                    int iva = 0;
                    int subtotal;
                    int total;
                    
                    subtotal=cantidadComercial*precioComercial+cantidadParticular*precioParticular;
                    
                    if(totalcarros==1){
                        iva=(int) Math.ceil(subtotal*0.2);
                    }else if(totalcarros==2){
                        iva=(int) Math.ceil(subtotal*0.19);
                    }else if(totalcarros==3){
                        iva=(int) Math.ceil(subtotal*0.18);
                    }else if(totalcarros==4){
                        iva=(int) Math.ceil(subtotal*0.17);
                    }else if(totalcarros==5){
                        iva=(int) Math.ceil(subtotal*0.16);
                    }else if(totalcarros==6){
                        iva=(int) Math.ceil(subtotal*0.15);
                    }else if(totalcarros==7){
                        iva=(int) Math.ceil(subtotal*0.14);
                    }else if(totalcarros==8){
                        iva=(int) Math.ceil(subtotal*0.13);
                    }else if(totalcarros==9){
                        iva=(int) Math.ceil(subtotal*0.12);
                    }else if(totalcarros==10){
                        iva=(int) Math.ceil(subtotal*0.11);
                    }else if(totalcarros==11){
                        iva=(int) Math.ceil(subtotal*0.10);
                    }else if(totalcarros==12){
                        iva=(int) Math.ceil(subtotal*0.09);
                    }else if(totalcarros==13){
                        iva=(int) Math.ceil(subtotal*0.08);
                    }else if(totalcarros==14){
                        iva=(int) Math.ceil(subtotal*0.07);
                    }else if(totalcarros==15){
                        iva=(int) Math.ceil(subtotal*0.06);
                    }else if(totalcarros==16){
                        iva=(int) Math.ceil(subtotal*0.05);
                    }else if(totalcarros==17){
                        iva=(int) Math.ceil(subtotal*0.04);
                    }else if(totalcarros==18){
                        iva=(int) Math.ceil(subtotal*0.03);
                    }else if(totalcarros==19){
                        iva=(int) Math.ceil(subtotal*0.02);
                    }else if(totalcarros==20){
                        iva=(int) (subtotal*0.01);
                    }else if(totalcarros>20){
                        iva=(int)Math.ceil(subtotal*0.0); 
                    }
                    total=(int) (subtotal+iva);        
                    System.out.println("CONCESIONARIO UNCAR");
                    System.out.println("UNCAR - UNIVA");
                    System.out.println("NIT: 899.999.063");
                    System.out.println("Cliente: "+cedula);
                    System.out.println("Vehículo Cant Precio");
                    System.out.println("Particular x"+cantidadParticular+" $"+precioParticular);
                    System.out.println("Comercial x"+cantidadComercial+" $"+precioComercial);
                    System.out.println("Iva: $"+iva);
                    System.out.println("Total: $"+total);
                    System.out.println("---");
                    
                particulares-=cantidadParticular;
                comerciales-=cantidadComercial;
                }
                
                
                
        }else if(opcion.equals("4")){
                System.out.println("Particular: "+particulares);
                System.out.println("Comercial: "+comerciales);
            
        }else{
            break;
        }
        


        }
         
        
        
    }
    
    
}
