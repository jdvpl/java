package com.jdvpl.groot;

import java.util.Scanner;

public class Groot {
    
    public static String Lol(int n){
        int x=1;
        String valor="";
        String lol="";
        String that="that ";
        while(x<=n){
           if(x%2==0){
               lol="I groot ";
           }else{
               lol="I am ";
           }
           if(x==1){
              valor+=lol; 
           }else{
                valor+=that+lol;
           }
            x++;
        }
        return valor+"it";
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        System.out.println(Lol(l));
    }
    
}
