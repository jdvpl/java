
package com.jdvpl.condicionales;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=Integer.parseInt(sc.nextLine());
        int B=Integer.parseInt(sc.nextLine());
        int C=Integer.parseInt(sc.nextLine());
        int D=Integer.parseInt(sc.nextLine());
        
        if((B>C)&&(D>A)&&((C+D)>(A+B))&&(C>0)&&(D>0) && (A%2==0)){
            System.out.println("Valores aceptados ");
        }else{
            System.out.println("Valores no aceptados");
        }
        
    }
    
}
