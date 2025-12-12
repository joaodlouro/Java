package lista11.matrizes11;
import utils.MostrarMatrizes;
import java.util.Scanner;

public class Matrizes11Ex20 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    double [][] m1 =  new double [3][6];
    double soma234 = 0;
    double somaImpares = 0;
    int quantidade = 3 * 2;
    
     MostrarMatrizes.RandomMatrizDouble(m1);

    
     for(int i = 0;i < 3; i++){
        somaImpares += m1[i][0];
        somaImpares += m1[i][2];

        somaImpares += m1[i][4];
     }

     for(int i = 0;i < 3;i++){
        soma234+= m1[i][1];
         soma234+= m1[i][3];

     }
     
     double media = soma234 / quantidade;

    for(int i=0; i < 3;i++){
        m1[i][5] = m1[i][0] + m1[i][1];

    } 


        System.out.println("Matriz modificada:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma das colunas ímpares: " + somaImpares);

        System.out.println("Media das colunas 2 e 4: " + media);

        
    }
    
}

/*
Fac¸a programa que leia uma matriz 3 x 6 com valores reais.
(a) Imprima a soma de todos os elementos das colunas ´ımpares.
(b) Imprima a m ´edia aritm ´etica dos elementos da segunda e quarta colunas.
(c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
(d) Imprima a matriz modificada.
*/
