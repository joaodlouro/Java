package vetores;
import java.util.Scanner;
import java.security.SecureRandom;

public class tabuleiro {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite valor do tabuleiro!");
        int n= sc.nextInt();

         if(n <= 0){
            System.out.println("Tamanho deve ser positivo! ");
            sc.close();
            return;

         } 

        for(int i = 0; i < n; i++){
            for(int j = 0;j < n; j++){
            boolean borda = (i ==0) || (i==n -1) || (j == 0) || (j == n - 1);
            boolean diagonal = (i ==j);
            boolean  diagonal2 = (i + j == n -1);


             if(borda || diagonal || diagonal2){
                System.out.printf("X ");

             } else {
                System.out.printf("O ");
             }
            }
            System.out.println();
        }

        sc.close();

         
         
    }
}
        

//new == criar objeto

 // tamanho / largura do vetor

 // tudo que vale para vetores, também vale para Matrizes!
