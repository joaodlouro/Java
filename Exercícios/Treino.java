
/*Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO,
deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o
valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor
lido pelo segundo valor lido. */
package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {

          Scanner sc= new Scanner(System.in);

          int valor1, valor2;

          System.out.println(" valor 1: ");
          valor1 = sc.nextInt();


          while (true) {
            System.out.println("valor 2 : ");
            valor2 = sc.nextInt();

            if(valor2 == 0){
                  System.out.println("valor 2 não pode ser 0");

            } else{
                 
                  break;
            }
            
          }
          double divisão = (double) valor1 / valor2;

          System.out.printf(" valor divisão: %.2f\n", + divisão);
          
          sc.close();

          
    }
}
