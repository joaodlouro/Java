/*Faça um programa que, para um número indeterminado de pessoas: leia a idade de
cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
considerada. A seguir calcule:
• o número de pessoas;
• a idade média do grupo;
• a menor idade e a maior idade */

package Exercícios;
import java.util.Scanner;

public class Treino{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
   
    int idade;
    int maioridade=0;
    int menoridade=0;
    double media;
    int pessoas=0;
     int somaIdades=0;
  

    for(;;){
      System.out.println("qual a idade? (digite 0 para sair)");

       idade = sc.nextInt();

         

       if(idade == 0){
            System.out.println("idade invalidade: ");
            break;
       }

       pessoas++;
       somaIdades += idade;


       if(pessoas ==1){
            menoridade= idade;
            maioridade = idade;
       }else{
              if(idade < menoridade){
                  menoridade = idade;
              }
              if(idade > maioridade){
                  maioridade= idade;
              }

       }

    }

       media = (double) somaIdades / pessoas;
       System.out.println("total pessoas: " + pessoas);
       System.out.println("maior: " + maioridade);
       System.out.println("menor" + menoridade);
       System.out.println("media" + media);
  



}

}