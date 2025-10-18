/*Solicitar um número inteiro positivo ao usuário, validando a entrada de dados
(informando se ele estiver errado e repetindo a solicitação até que esteja correto).
Após o programa deve informar todos os números pares existentes entre 1 e o
número fornecido pelo usuário. ao final ele pergunte ao usuário se ele deseja
informar um outro número. Caso positivo, o programa deve ser repetido. */

package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          int numero; 
           String resposta ;

      do {
            
            do {
                System.out.println("Qual valor do numero? ");
                numero = sc.nextInt();
                if (numero <= 0) {
                    System.out.println("valor tem que ser positivo:");
                }
            } while (numero <= 0);

           
            for (int i = 2; i <= numero; i += 2) {
                System.out.print(i + " ");
            }

            System.out.println();

            System.out.println("deseja continuar s/n");
            resposta = sc.next();

      } while (resposta.equalsIgnoreCase("s"));
                      
      

         
       

          
    }
}
