package lista11.matrizes11;
import utils.MostrarMatrizes;
import java.util.Scanner;

public class Matrizes11Ex17 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double [][] notas = new double [10][3];

        for(int i =0; i < 10;i++){

          System.out.println("Alunos" + (i + 1) + ": ");

          for(int j =0;j < 3;j++){
            System.out.println("Nota da prova" + (j+1)+ ": ");
            notas[i][j]= sc.nextDouble();

          }
        }

        int piorP1 = 0, piorP2 = 0, piorP3=0;



        for(int i=0;i < 10;i++){
          double menor  = notas [i][0];
          int indiceMenor = 0;

          if(notas[i][1] < menor){
            menor = notas[i][1];
            indiceMenor = 1;
    }

          if(notas[i][2] < menor){
            menor = notas[i][2];
            indiceMenor = 2;
          }

          if(indiceMenor == 0){
            piorP1++;

          } else if(indiceMenor ==1){
            piorP2++;

          }else{
            piorP3++;
          }

        }


        System.out.println("Pior nota na prova 1: " + piorP1);
        System.out.println("Pior nota na prova 2: " + piorP2);
        System.out.println("Pior nota na prova 3: " + piorP3);




    }
    
}

/*
Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva
o n ´umero de alunos cuja pior nota foi na prova 1, o n ´umero de alunos cuja pior nota foi
na prova 2, e o n ´umero de alunos cuja pior nota foi na prova 3. Em caso de empate
das piores notas de um aluno, o crit ´erio de desempate ´e arbitr ´ario, mas o aluno deve ser
contabilizado apenas uma vez.
*/