package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("de um valor numerico 1: ");
     int valor1= sc.nextInt();

    System.out.println("de um valor numerico 2: ");
         int valor2= sc.nextInt();

    System.out.println("de um valor numerico 3: ");
         int valor3= sc.nextInt();

           int maior;
         if(valor1 > valor2 && valor1 > valor3){
            maior =   valor1;
         } else if(valor1 > valor2 && valor1 > valor3){
            maior = valor2;

         } else{
            maior = valor3; 
            System.out.println("valor maior é:" + maior);
         }
 
    sc.close();


    }
    
    
}
