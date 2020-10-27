
package com.jdvpl.condicionales;

import java.util.Scanner;


public class covid {
    public static int Covid(double num, double num2){
        
        while (true){
            try {
                if(num<=100000000 && num>0){
                break;
            }  
            } catch (Exception e) {
                System.out.println("El valor es incorrecto, debes ingresar un numero");
            }
        }
        while (true){
            try {

                if(num>=num2 && num2>=0){
                break;
            }  
            } catch (Exception e) {
                System.out.println("El valor es incorrecto, debes ingresar un numero"); 
            }
        }
        int dia=1;
        while (num2<num){
            num=num*1.02;
            num2=num2*1.03;
            dia++;
        }
        return  dia;
    }
         
    
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println(Covid(num1, num2));
    }
    
}
