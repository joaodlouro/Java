package Exercícios;
import java.util.Scanner;

public class AlgoritmoInt{
   public static void main(String[]args){

     Scanner sc= new Scanner(System.in);

     System.out.println("De uma valor numerico positivo");
     
  


     if(sc.hasNextInt()){
       int  valor = sc.nextInt();
     


     if(valor > 0){
      System.err.println("valor positivo!");
     } else if(valor < 0){
      System.out.println("valor negativo!");
     } 
     else{
      System.out.println("isso e zero!"); 

     }
    } else {
      System.out.println("isso nao e um numero!");

     }


     sc.close();


   }

}

