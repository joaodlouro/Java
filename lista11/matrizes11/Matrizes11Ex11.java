package lista11.matrizes11;
import utils.MostrarMatrizes;

public class Matrizes11Ex11 {
public static void main(String[] args) {

       int soma = 0;
       int [][]m1 = new int [3][3];

       MostrarMatrizes.RandomMatriz(m1);

       for(int i = 0; i < m1.length;i++){
        for(int j = 0; j < m1[i].length;j++){

            if( j + i ==2){
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
Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que est ˜ao na diago-
nal secund ´aria.
 */