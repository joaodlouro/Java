package lista11.matrizes11;
import utils.MostrarMatrizes;
public class Matrizes11Ex12 {
    public static void main(String[] args) {


       int [][]m1 = new int [3][3];
        int [][]m2 = new int [3][3];


       MostrarMatrizes.RandomMatriz(m1);

       for(int i = 0; i < m1.length;i++){
        for(int j = 0; j < m1[i].length;j++){
            m2[j][i] = m1[i][j];

        }
       }
       MostrarMatrizes.mostraMatriz(m1);

       System.out.println("----------------");

       System.out.println("Transposta");

       MostrarMatrizes.mostraMatriz(m2);

        
    }
    
}


/*
Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.
transposta ==  
as linhas viram colunas

as colunas viram linhas

 */