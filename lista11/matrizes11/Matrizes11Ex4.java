package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;


public class Matrizes11Ex4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];

        System.out.println("De 16 valores: ");

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = sc.nextInt();
            }
        }

        
        MostrarMatrizes.mostraMatriz(m);

       
        int maior = m[0][0];
        int linha = 0, coluna = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(m[i][j] > maior){
                    maior = m[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior valor: " + maior +
            " (linha " + linha +
            ", coluna " + coluna + ")");
    }
}


/*Leia uma matriz 4 x 4, imprima a matriz e retorne a localizac¸ ˜ao (linha e a coluna) do
maior valor.*/