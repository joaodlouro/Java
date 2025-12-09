package lista11.matrizes11;
import utils.MostrarMatrizes;

public class Matrizes11Ex6 {
public static void main(String[] args) {

int m1 [][] = new int [4][4];
int m2 [][] = new int [4][4];
int m3 [][] = new int [4][4];


MostrarMatrizes.RandomMatriz(m1);
System.out.println("-------------------");
MostrarMatrizes.RandomMatriz(m2);
System.out.println("-------------------");

System.out.println("Matriz 1:");
MostrarMatrizes.mostraMatriz(m1);
System.out.println("-------------------");
System.out.println("\nMatriz 2:");
MostrarMatrizes.mostraMatriz(m2);
System.out.println("-------------------");

for(int i =0; i < 4; i++){
    for(int j = 0; j < 4; j++){

      if(m1[i][j] > m2[i][j]){
        m3[i][j] = m1[i][j];
      }else{
        m3[i][j] = m2[i][j];          
      }
    }


}

 System.out.println("resultado m3");
 MostrarMatrizes.mostraMatriz(m3);

}
}


/*
 Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posic¸ ˜ao
das matrizes lidas.
*/