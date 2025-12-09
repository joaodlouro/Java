package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;

public class Matrizes11Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];

       
        System.out.println("Digite 25 valores:");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                m[i][j] = sc.nextInt();
            }
        }

      
        MostrarMatrizes.mostraMatriz(m);

      
        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();

        
        boolean encontrado = false;
        int linha = -1, coluna = -1;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(m[i][j] == x){
                    encontrado = true;
                    linha = i;
                    coluna = j;
                    break; 
                }
            }
            if(encontrado) break; 

        if(encontrado){
            System.out.println("Valor encontrado na linha " + linha +   ", coluna " + coluna);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}
}


/*Leia uma matriz 5 x 5. Leia tamb ´em um valor X. O programa dever ´a fazer uma busca
desse valor na matriz e, ao final, escrever a localizac¸ ˜ao (linha e coluna) ou uma mensa-
gem de “n ˜ao encontrado”*/