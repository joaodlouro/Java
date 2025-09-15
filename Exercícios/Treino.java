package Exercícios;
import java.util.Scanner;

public class Treino{

  public static void main(String[]args){

    Scanner sc= new Scanner(System.in);
     
    System.out.println("informe um numero");
     

    if(sc.hasNextInt()){

        int numero = sc.nextInt();
        int quadrado = numero * numero;
        
        System.out.println("Esse e o quadrado do numero:" + quadrado);
    } else {
       System.out.println("Não e um valor valido");
    }

   sc.close();

  }

}