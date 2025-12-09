package lista11.matrizes11;
import utils.MostrarMatrizes;
public class Matrizes11Ex8 {
    public static void main(String[] args) {
       int soma = 0;
       int [][]m1 = new int [3][3];

       MostrarMatrizes.RandomMatriz(m1);

       for(int i = 0; i < m1.length;i++){
        for(int j = 0; j < m1[i].length;j++){

            if( j > i ){
                soma += m1[i][j];
                
            }
        }
       }
       MostrarMatrizes.mostraMatriz(m1);

       System.out.println("----------------");

       System.out.println("soma dos elementos: " + soma);


    }
    
}

/*
 Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que est ˜ao acima da
diagonal principal.
i linha, j coluna sempre

Diagonal é onde o índice da linha é igual ao índice da coluna!!!!!
*/


