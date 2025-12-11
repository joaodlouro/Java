package lista11.matrizes11;
import utils.MostrarMatrizes;
import utils.MostrarVetores;

import java.util.Scanner;

public class Matrizes11Ex15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char [][] respostas = new char [5][10];
        char [] gabarito =  new char [10];
        int  []resultados = new int [5];

        for(int i = 0;i < 10;i++){
            char abcd;
            do{
                abcd = sc.next().toLowerCase().charAt(0);

            }while(abcd < 'a' || abcd > 'd');
            gabarito[i] = abcd;

        }

        for(int i = 0;i < 5; i++){
            System.out.println("Resposta  aluno" + i + ": ");
            for(int j= 0;j < 10;j++){
                char abcd;

                do{
                     abcd = sc.next().toLowerCase().charAt(0);
                }while(abcd < 'a' || abcd > 'd' );

                respostas[i][j] = abcd;

            }

        }

        for(int i =0;i < 5;i++){
            int pontos=0;
            for(int j =0;j < 10;j++){

                if(respostas[i][j] ==gabarito[j]){
                    pontos++;

                }

        
            }
         resultados[i]= pontos;
                }
       

        
          
        
    }
    
}

/*
Leia uma matriz 5 x 10 que se refere respostas de 10 quest ˜oes de m ´ultipla escolha,
referentes a 5 alunos. Leia tamb ´em um vetor de 10 posic¸ ˜oes contendo o gabarito de
respostas que podem ser a, b, c ou d. Seu programa dever ´a comparar as respostas
de cada candidato com o gabarito e emitir um vetor denominado resultado, contendo a
pontuac¸ ˜ao correspondente a cada aluno.
*/