package Exercícios;

import java.util.Scanner;

public class  AlgoritmoInt{
    public static void main (String[]args){

     Scanner sc = new Scanner(System.in);

     System.out.println("De um valor numerico");

      if (sc.hasNextInt()) { 
            int valor = sc.nextInt();

     if(valor > 0){

        System.out.println("Valor numerico positivo!");
     } else if( valor < 0 ){
        System.out.printf("valor negativo!");

     } else{
        System.out.println("isso e zero!");
 
     } 
    }else {
        System.out.println("isso nao e um numero!");
     }
     sc.close();

    }







}