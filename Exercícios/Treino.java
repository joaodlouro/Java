package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int countpares = 0; 
        int countimpares = 0;
        int maiorpar = Integer.MIN_VALUE;
        int menorpimpar = Integer.MAX_VALUE;
        double mediaP = 0.0;
        double mediaI = 0.0;

        for(;;){

          System.out.println("Digite um valor maior que 0: ");
          int valor = sc.nextInt();

          if( valor <= 0){
            break;
          }

          if(valor % 2 == 0){
            pares =  pares + valor;
            countpares++;
            if(valor > maiorpar){
              maiorpar = valor;
            }
            
          } else {
            impares = impares + valor;
            countimpares++;
            if(valor < menorpimpar){
              menorpimpar = valor;
            }
            }

          }

          mediaP=  (double) pares / countpares;
          mediaI=  (double) impares / countimpares;  

            





                System.out.println("soma pares:  "+ pares);

                System.out.println("-----------------");

                System.out.println("mairor par:  " + maiorpar);

                System.out.println("-----------------");

                System.out.println("menor impar:  " + menorpimpar);

                System.out.println("-----------------");

                System.out.println("media pares:  " + mediaP);

                System.out.println("media impares:  " + mediaI );

                sc.close();



        }
    }

