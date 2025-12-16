package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;
import utils.MostrarVetores;


public class treino {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

         int [][] m1  = {{1,2,3}
         ,{4,5,6},
          {7,8,9}};
        int []somacolunas = new int [3];

       

        for(int j = 0;j < 3;j++){
            int soma = 0;
            for(int i = 0;i < 3;i++){

                soma = soma + m1[i][j];

            }
            somacolunas[j]=soma;

        }
  
          for(int i =0;i < 3;i++){
            System.out.println(somacolunas[i]);

          }
            



        

    }
    
}
