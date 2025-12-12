package lista11.matrizes11;
import utils.MostrarMatrizes;
import java.util.Scanner;

public class Matrizes11Ex19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] []alunos= new int[5][4];

        for(int i=0;i < 5;i++){
            System.out.println("Alunos " + (i +1));

            System.out.println("Matricula: ");
            alunos[i][0] = sc.nextInt();

            System.out.print("Média das provas: ");
            alunos[i][1] = sc.nextInt();

            System.out.print("Média dos trabalhos: ");
            alunos[i][2] = sc.nextInt();

             alunos[i][3] = alunos[i][1] + alunos[i][2];
        }
        
            int maiorNota = alunos[0][3];
            int maiorMatricula = alunos[0][0];

            for (int i = 1; i < 5; i++) {
            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                maiorMatricula = alunos[i][0];
            }
        }

        int somaNFinais = 0;

        for(int i =0;i <5;i++){
            somaNFinais +=  alunos[i][3];
        }

        double mediaFinal = somaNFinais / 5.0;
        
        System.out.println("Alunos com amior nota: " + maiorMatricula);

        System.out.println("Medias finais: " + mediaFinal);
    }
    
}

/*
Fac¸a um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes
informac¸ ˜oes sobre alunos de uma disciplina, sendo todas as informac¸ ˜oes do tipo inteiro:
• Primeira coluna: n ´umero de matr´ıcula (use um inteiro)
• Segunda coluna: m ´edia das provas
• Terceira coluna: m ´edia dos trabalhos
• Quarta coluna: nota final
Elabore um programa que:
5
(a) Leia as tr ˆes primeiras informac¸ ˜oes de cada aluno
(b) Calcule a nota final como sendo a soma da m ´edia das provas e da m ´edia dos
trabalhos
(c) Imprima a matr´ıcula do aluno que obteve a maior nota final (assuma que s ´o existe
uma maior nota)
(d) Imprima a m ´edia aritm ´etica das notas finais

*/

