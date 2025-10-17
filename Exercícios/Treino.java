/*
 Faça um programa que, para um número indeterminado de pessoas: leia a idade de
cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
considerada. A seguir calcule:
• o número de pessoas;
• a idade média do grupo;
• a menor idade e a maior idade
 */


package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {

          Scanner sc= new Scanner(System.in);

          int idade;
          int maiorIdade = 0;
          int  menorIdade = 0; 
          double somaIdade = 0; 
          int pessoas = 0; 


          while(true){
            
                 System.out.println("Digite um para para o loop"); 
                System.out.println("valor de idade:"); 
                idade = sc.nextInt();

            if (idade == 0){
                System.out.println("fim do loop ");
                
                break;
              
            }
            pessoas ++;   // ou pessoa = pessoas + 1; 
            somaIdade = idade + somaIdade;
             
            if(pessoas == 1 ){
                menorIdade= idade;
                maiorIdade = idade;
            } else{
                if (idade < menorIdade) menorIdade = idade;
                if (idade > maiorIdade) maiorIdade = idade;
            }
                    
        


          }
          double media = somaIdade / pessoas;

      System.out.println("Número de pessoas: " + pessoas);
       System.out.println("Idade média: " + media);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Maior idade: " + maiorIdade);

        


          }

     


    }

/*
   if (idade < menorIdade) menorIdade = idade;
                if (idade > maiorIdade) maiorIdade = idade;

                mesma coisa que 

                if (idade < menorIdade){
                   menorIdade= idade;
                }

                if(idade > maiorIdade){
                   maiorIdade= idade;
                }

*/