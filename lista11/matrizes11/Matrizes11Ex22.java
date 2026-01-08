package lista11.matrizes11;
import utils.MostrarMatrizes;


public class Matrizes11Ex22 {
    public static void main(String[] args) {
        
       int[][] A = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };

       int[][] B = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };
        
        int C [][]=  new int [3][3];    

        for(int i = 0;i <3;i++){
            for(int j = 0;j< 3 ;j++){
                for(int k = 0;k < 3;k++){
                    C[i][j] += A[i][k] * B[k][j];

                }

            }
        }


        
       


    }
    
}
 

/*

Fac¸a um programa que leia duas matrizes A e B de tamanho 3 x 3 e calcule C = A ∗ B.

*/