package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numero;
        int somapares =0, somaimapares=0;
        int quatidadepares=0, quantidadeimpares=0; 
        int maiorpar= 0, maiorimpar=0;
        boolean tempar = true, temimpar = false;
        System.out.println("  <= 0 para sair:  ");


        for(;;){

         numero = sc.nextInt();

         if(numero <= 0){
            break;
         }

         if(numero % 2 ==0){
          somapares += numero;
          quatidadepares++;
          if(!tempar || numero > maiorpar){
            maiorpar = numero;
            tempar = true;
          } else {
            somaimapares += numero;
            quantidadeimpares++;
          }
          if( !temimpar || numero > maiorimpar){
            maiorimpar = numero;
            temimpar = true;
          }

         }
        }

        System.out.println(" Resultados");

        if(tempar){
            System.out.println(" Soma dos pares: " + somapares);
            System.out.println(" Quantidade de pares: " + quatidadepares);
            System.out.println(" Maior par: " + maiorpar);
        } else {
            System.out.println(" Nao foram digitados numeros pares");
        }

        if(temimpar){
            System.out.println(" Soma dos impares: " + somaimapares);
            System.out.println(" Quantidade de impares: " + quantidadeimpares);
            System.out.println(" Maior impar: " + maiorimpar);
        } else {
            System.out.println(" Nao foram digitados numeros impares");
        }







       

        sc.close();
    }
}
