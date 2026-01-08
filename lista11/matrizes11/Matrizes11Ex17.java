package lista11.matrizes11;
import utils.MostrarMatrizes;
import java.util.Scanner;

import loops.potencia;

public class Matrizes11Ex17 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);   
     double v [][] = new double[10][3];

     for(int i =0;i < 10;i++){
      for(int j = 0;j < 3;j++){
        v[i][j] = sc.nextDouble();

      }
     }

     double piornota1=0, piornota2=0, piornota3=0;

      for(int i =0;i < 10;i++ ){

        double nota1 = v[i][0],  nota2= v[i][1] ,  nota3 = v[i][2];

        double menornota=nota1;

        int prova = 1;

        if(piornota2 < menornota){
          menornota = nota2;
          prova = 2;


        }

        if(piornota3 < menornota){
          menornota = nota3;
          prova = 3;

        }

          if (prova == 1) piornota1++;
            else if (prova == 2) piornota2++;
            else piornota3++;

        }

         System.out.println("Pior nota na prova 1: " + piornota1);
        System.out.println("Pior nota na prova 2: " + piornota2);
        System.out.println("Pior nota na prova 3: " + piornota3);


      }

    }
  
    


/*
Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva
o n ´umero de alunos cuja pior nota foi na prova 1, o n ´umero de alunos cuja pior nota foi
na prova 2, e o n ´umero de alunos cuja pior nota foi na prova 3. Em caso de empate
das piores notas de um aluno, o crit ´erio de desempate ´e arbitr ´ario, mas o aluno deve ser
contabilizado apenas uma vez.
*/