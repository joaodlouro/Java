package lista11.matrizes11;
import java.util.Scanner;

import utils.MostrarMatrizes;
public class Matrizes11Ex18 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int [][] m1 = new int  [3][3];
        int [] somaColunas = new int [3];

        System.out.println("digite  os 9 valores da matriz");

        MostrarMatrizes.IntNumerosMatriz(m1);
        
        for(int j =0;j < 3;j++){
            int soma=0;
            for(int i=0;i < 3; i++){
                soma =  soma + m1[i][j];

            }
            somaColunas[j] = soma;
        }
      

         System.out.println("Vetor com a soma das colunas:");

        for (int j = 0; j < 3; j++) {

         System.out.print(somaColunas[j] + " ");

    }
    
}
}

/*
 Fac¸a um programa que permita ao usu ´ario entrar com uma matriz de 3 x 3 n ´umeros
inteiros. Em seguida, gere um array unidimensional pela soma dos n ´umeros de cada
coluna da matriz e mostrar na tela esse array. Por exemplo, a matriz:
5 -8 10
1 2 15
25 10 7
Vai gerar um vetor, onde cada posic¸ ˜ao ´e a soma das colunas da matriz. A primeira
posic¸ ˜ao ser ´a 5 + 1 + 25, e assim por diante:
31 4 3

*/