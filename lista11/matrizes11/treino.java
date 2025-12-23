package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;
import utils.MostrarVetores;


public class treino {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
            
           int  [] v1 = new int [3];

          MostrarVetores.PrencherVetorInt(v1);

          for(int i= v1.length -1 ;  i >= 0;--i){
            System.out.println(v1[i]);

          }








              }
    }
    




/*

  for(int i=0;i < 3;i++){
            for(int j=0; j < 6;j++){
              System.out.printf("%8.2f ", m1[i][j]);
              // lembrar dessa formatação de saida

            }
            System.out.println();
           }
   
   colunas já estão fixas (j = 1 e j = 3) , logo nao precisa de outro for

   lembrar == C[i][j]=k=0∑2​A[i][k]×B[k][j] !

*/