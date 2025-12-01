package vetores;
import java.util.Scanner;
import java.security.SecureRandom;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("de valor: ");
        int n = sc.nextInt();

        char [] [] tabuleiro = new char [n] [n];

        for(int i =0;i < n ;i++){
            for(int j =0; j < n; j++){
                if(i == 0 || i == n -1 || j == 0 || j == n -1){
                    tabuleiro[i][j] = 'X';
                }  
                else if (i == j) {
                    tabuleiro[i][j] = 'X';
                }
                else if (i + j == n - 1) {
                    tabuleiro[i][j] = 'X';
                }
                else {
                    tabuleiro[i][j] = 'O';
                }
            }
        }

        for(int i = 0;i< n;i++){
            for(int j = 0;j < n; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        
//new == criar objeto

// tamanho / largura do vetor

// tudo que vale para vetores, também vale para Matrizes!
