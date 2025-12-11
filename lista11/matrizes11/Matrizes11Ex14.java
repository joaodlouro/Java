package lista11.matrizes11;
import utils.MostrarMatrizes;
import java.util.Random;

public class Matrizes11Ex14 {
    public static void main(String[] args) {
        Random rm = new Random();
        

        int [][] m1 = new int [5][5];
        boolean utilizado []  = new boolean[100];     
 

         for(int i = 0; i < 5;i++){
            for(int j= 0; j < 5;j++){

               int numero;
               do{
                numero= rm.nextInt(100);

               }while(utilizado[numero]);

                 utilizado[numero]= true;
                 m1[i][j]= numero;
              
    }
}
    MostrarMatrizes.mostraMatriz(m1);

}
}


/*
Fac¸a um programa para gerar automaticamente n ´umeros entre 0 e 99 de uma cartela de
bingo. Sabendo que cada cartela dever ´a conter 5 linhas de 5 n ´umeros, gere estes dados
de modo a n ˜ao ter n ´umeros repetidos dentro das cartelas. O programa deve exibir na
tela a cartela gerada.
*/