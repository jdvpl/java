
package com.jdvpl.anos;

import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int cantidad=Integer.parseInt(sc.nextLine());
        int residuo=0;
        int anos=cantidad/365;
        residuo=cantidad%365;
        int mes=residuo/30;
        residuo=residuo%30;
        System.out.println(anos+" año(s)");
        System.out.println(mes+" mes(s)");
        System.out.println(residuo+" día(s)");
    }
    
}
