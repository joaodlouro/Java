package loops;
import java.util.Scanner;

public class treinoloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 [] = new int [10];
        System.out.println("De os valores do vetor!");
        
        for(int i = 0 ; i < 10; i++){

           System.out.println("digite o valor da posição" + i + " ");

           v1[i] = sc.nextInt();

          


        }

         for (int i = 0; i < 10 ; i ++){
            System.out.println(v1[i]);

         }

    } 
}
