package Exercícios;
import java.util.Scanner;

public class AlgoritmoInt{
   public static void main(String[]args){

    Scanner sc = new Scanner( System.in);

    System.out.println("você gosta de café?");
      String Resposta = sc.nextLine();
       

      if(Resposta.equals("sim")){

         System.out.println("Eu já esperava isso");
      }
      else if(Resposta.equals("nao")){
        System.out.println("Por que não??");
      } else{
        System.out.println("Por favor, me responda!!!");
      }



      sc.close();
      


     }



   }



