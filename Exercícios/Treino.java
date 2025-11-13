package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int numero;
        int maiorpar=Integer.MIN_VALUE;
        int menorimpar=Integer.MAX_VALUE;
        int par=0;
        int impar =0;
        int contadorpar =0;
        int contadorimpar=0;
       

        while (true) {
            System.out.println("digite um numero: ");
            numero = sc.nextInt();
             

             if(numero <= 0){
                break;
             }

             if(numero % 2 ==0){
               par = par + numero;
               contadorpar++;

               if(numero > maiorpar){
                  maiorpar = numero;
               }

             } else {
               impar = impar + numero;
                contadorimpar ++;

                if(numero < menorimpar){
                  menorimpar = numero;

                }
             }

        }


            double meidaimpar= (double) impar / contadorimpar;
             double meidapar = (double) par /contadorpar;

           

        System.out.println("esse e o menor impar: " + meidaimpar);

        System.out.println("maior par: " + maiorpar);

        System.out.println("media par: " + meidapar);

        System.out.println("media impar: " + meidaimpar);
    }
   }
