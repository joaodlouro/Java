package lista11.matrizes11;
import utils.MostrarMatrizes;

public class Matrizes11Ex23 {
    public static void main(String[] args) {
        
   int [][]A = new int [3][3];
   int [][]B = new int [3][3];

   MostrarMatrizes.RandomMatrizInt(A);

   for(int i=0; i < 3; i ++){
    for(int j=0;j < 3;j++ ){
        B[i][j]=0;        
        for(int k =0;k < 3;k++){
            B[i][j] += A[i][k] * A[k][j];
          
        }
    }

   }

    MostrarMatrizes.mostraMatriz(B);

    }
}

/*
 Fac¸a um programa que leia uma matriz A de tamanho 3 x 3 e calcule B = A2

*/