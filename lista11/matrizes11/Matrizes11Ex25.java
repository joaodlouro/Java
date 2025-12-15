package lista11.matrizes11;

import utils.MostrarMatrizes;

public class Matrizes11Ex25 {
    public static void main(String[] args) {
        int [][] tab= {
            {-1, 1 , 1},
            {-1, -1, 0},
            { 0, 1,  0} 
        };

        for(int i =0; i < 3 ;i++){
            int soma = tab[i][0]+ tab[i][1]+ tab[i][2];

            if(soma == -2){
                for(int j=0;j < 3; j++){
                 if(tab[i][j]==0){
                    tab[i][j] = -1;
                    System.out.println("Jogada em: " + i + ", " + j);
                    break;

                 }

                }
                break;
            }

        }

        MostrarMatrizes.mostraMatriz(tab);





        
    }
    
}
/*
 Fac¸a um programa para determinar a pr ´oxima jogada em um Jogo da Velha. Assumir que
o tabuleiro ´e representado por uma matriz de 3 x 3, onde cada posic¸ ˜ao representa uma
das casas do tabuleiro. A matriz pode conter os seguintes valores -1, 0, 1 representando
respectivamente uma casa contendo uma pec¸a minha (-1), uma casa vazia do tabuleiro
(0), e uma casa contendo uma pec¸a do meu oponente (1).
Exemplo:
-1 1 1
-1 -1 0
0 1 0

*/