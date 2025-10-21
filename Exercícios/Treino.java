package Exercícios;

import java.util.Scanner;

public class Treino{
public static void main(String[] args) {

  Scanner sc= new Scanner(System.in);

  int n= 5;

  for(int i =1;i <= n; ++i){
   for(int j= i;j <= n; j++){
    System.out.print("  ");

   }
   for(int j=1; j<= i; j++){
    System.out.print("* ");

   }

     for(int j=1;j <= i; j++){
        System.out.print("* ");
     }
     
   
   System.out.println();

  }


     for(int i=n -1;i >= 1;--i){
        for(int j=n ; j >= i; --j){
            System.out.print("  ");

        }
        for(int j= 1; j<=i; ++j){
            System.out.print("* ");
        }
        for(int j= 1; j <= i; j++){
            System.out.print("* ");

           
        }
         System.out.println();
     }
     
  




}


}