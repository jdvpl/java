
package com.jdvpl.primero;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        Persona proveedor=new Persona();
        Persona cliente = new Persona();
        Persona Empleado=new Persona();
        
        System.out.println("Ingrese los Datos del proveedor: ");
        
        System.out.println("Ingrese el codigo: ");
        proveedor.setCodigo(entrada.next());
        System.out.println("Ingrese nombre: ");
        proveedor.setNombre(entrada.next());
        System.out.println("Ingrese Telefono: ");
        proveedor.setTelefono(entrada.next());
        System.out.println("Ingrese edad: ");
        proveedor.setEdad(entrada.nextInt());
        
        System.out.println("************************************\n");
        
         System.out.println("Ingrese los Datos del Cliente: ");
        
        System.out.println("Ingrese el codigo: ");
        cliente.setCodigo(entrada.next());
        System.out.println("Ingrese nombre: ");
        cliente.setNombre(entrada.next());
        System.out.println("Ingrese Telefono: ");
        cliente.setTelefono(entrada.next());
        System.out.println("Ingrese edad: ");
        cliente.setEdad(entrada.nextInt());
        
        System.out.println("************************************\n");
        
         System.out.println("Ingrese los Datos del Empleado: ");
        
        System.out.println("Ingrese el codigo: ");
        Empleado.setCodigo(entrada.next());
        System.out.println("Ingrese nombre: ");
        Empleado.setNombre(entrada.next());
        System.out.println("Ingrese Telefono: ");
        Empleado.setTelefono(entrada.next());
        System.out.println("Ingrese edad: ");
        Empleado.setEdad(entrada.nextInt());
        
        System.out.println("************************************\n");
        
         System.out.println("Los datos son del Cliente son: ");
         System.out.println("Codigo: "+proveedor.getCodigo());
         System.out.println("Nombre: "+proveedor.getNombre());
         System.out.println("Telefono: "+proveedor.getTelefono());
         System.out.println("Edad: "+proveedor.getEdad());
         
         
        
        
        
        
    }
    
}
