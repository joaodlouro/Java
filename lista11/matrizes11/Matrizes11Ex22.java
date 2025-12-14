package lista11.matrizes11;
import utils.MostrarMatrizes;


public class Matrizes11Ex22 {
    public static void main(String[] args) {
        
        int [][] A = new int [3][3];
        int [][] B = new int [3][3];
        int [][] C = new int [3][3];
        
         MostrarMatrizes.RandomMatrizInt(A);
         MostrarMatrizes.RandomMatrizInt(B);

        for(int i= 0;i < 3;i++){
        for(int j = 0;j < 3;j++){
            
            C[i][j]= 0 ;
             for(int k = 0;k < 3; k++){

                C[i][j]=  C[i][j] + A[i][k] * B[k][j];

             }                
             

            }
        }
        
       MostrarMatrizes.mostraMatriz(C);





    }
    
}


/*

Fac¸a um programa que leia duas matrizes A e B de tamanho 3 x 3 e calcule C = A ∗ B.

*/