package vetores;
import java.util.Scanner;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int v1 [] = new int[10];
        int v2 []= new int [10];
        
        
        for(int i =0; i < 10 ; i++){
          System.out.println("valores" + i + " ");

          v1[i]= sc.nextInt();

        }

        int soma= 0;

        for(int i =0;i <10; i++){

          soma = soma + v1[i];

          v2[i]= soma;

        }

       for(int i=0 ;i < 10;i++){

        System.out.println("valor da soma = " + v2[i]);

       }



        

   

    }
}
        

// Crie 2 vetores de 10 posições cada um (chame de v1[10] e v2[10]). Digite 10 valores para v1. Agora,
// use o v2 para armazenar A SOMA de TODOS os valores de índices anteriores de v1, inclusive o
// próprio índice. Exemplo:
// v2[0] deve armazenar o valor de v1[0];
// v2[1] deve armazenar o valor de v1[0] + v1[1];
// v2[2] deve armazenar o valor de v1[0] + v1[1] + v1[2];
         


//new == criar objeto


 // tamanho / largura do vetor
