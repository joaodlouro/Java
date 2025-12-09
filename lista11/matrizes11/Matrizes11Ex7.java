package lista11.matrizes11;
import utils.MostrarMatrizes;

public class Matrizes11Ex7 {
    public static void main(String[] args) {
    int [][] m1= new int [10][10];

    for(int i = 0;i <10; i++){
        for(int j=0; j < 10;j++){

            if(i<j){
                m1[i][j]= 2*i + 7*j - 2;
             }else if(i == j){
                    m1[i][j] = 3*(i *i) - 1;
                } else{
                m1[i][j]= 4 * (i*i*i) - 5*(j*j) +1;
            }
        }
    }

       MostrarMatrizes.mostraMatriz(m1);
        
    }
}

/*
 Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos s ˜ao da forma:
A[i][j] = 2i + 7j − 2 se i < j;
A[i][j] = 3i2 − 1 se i = j;
A[i][j] = 4i3 − 5j2 + 1 se i > j.
*/
