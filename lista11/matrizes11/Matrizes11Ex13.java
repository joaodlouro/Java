package lista11.matrizes11;
import utils.MostrarMatrizes;
import java.util.Random;
public class Matrizes11Ex13 {
    public static void main(String[] args) {
        Random rm= new Random();
         int [][]m1 = new int [4][4];
         int [][]m2 = new int [4][4];
        
         
         for(int i = 0;i < 4;i++){
            for(int j= 0; j < 4;j++){
                m1[i][j]= rm.nextInt(20)+1;
                m2[i][j] = m1[i][j];
            }
         }
         
         System.out.println("Matriz original");
         MostrarMatrizes.mostraMatriz(m1);

         System.out.println("-----------------");
          
         for(int i = 0;i < 4;i++){
            for(int j = 0;j< 4;j++){
               if(j > i){
                m2[i][j] = 0;

               }
            }
         }

         System.out.println("matriz transformada");

         MostrarMatrizes.mostraMatriz(m2);


        

        }

    }


/*
Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme
a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os ele-
mentos acima da diagonal principal. Imprima a matriz original e a matriz transformada.
*/
    
    
