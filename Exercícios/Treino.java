package Exercícios;
import java.util.Scanner;

public class Treino{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();


      if( N  % 2 == 0){
        System.out.println("par");

      } else{
        System.out.println("impar");
      }


      if (N % 5 == 0){
        System.out.println("Multi de 5");
      } else{
        System.out.println("não e multi de 5");
      }

      sc.close();




      
    }

}