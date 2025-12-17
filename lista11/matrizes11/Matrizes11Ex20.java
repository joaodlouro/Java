package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;
import utils.MostrarVetores;


public class Matrizes11Ex20 {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

           double [][] m1 = new double[3][6];
           double somaimparesj = 0;
           double somaAritmetica =0;
           double mediaAritmetica=0;
           int quantidadearitmetica = 0;
           double somacolunas1e2 =0;
       


           MostrarMatrizes.RandomMatrizDouble(m1);
            for(int i = 0; i < 3; i++){
              for(int j= 0;j < 6; j++){

                if(j % 2 != 0){
                  somaimparesj += m1[i][j];
                  
                }  

              }
            }

            for(int i = 0;i < 3;i++){
              somaAritmetica += m1[i][1];
              somaAritmetica += m1[i][3];
               
              quantidadearitmetica += 2;

            }

            for(int i =0;i < 3;i++){
              somacolunas1e2 =  m1[i][0] + m1[i][1];
              
              m1[i][5] = somacolunas1e2;

            }


            
             mediaAritmetica = somaAritmetica / quantidadearitmetica;



            System.out.println("-----------------");
    
            System.out.println("soma colunas impares: " + somaimparesj);

            System.out.println("-----------------");

            System.out.println("Media aritmetica dos elementos da segunda e da quarta Coluna: " + mediaAritmetica);

            System.out.println("-----------------");

            System.out.println("soma colunas 1 e 2 " + somacolunas1e2);

            System.out.println("-----------------");

            MostrarMatrizes.mostraMatrizDouble(m1);



    

         
    }
    
}



/*

  for(int i=0;i < 3;i++){
            for(int j=0; j < 6;j++){
              System.out.printf("%8.2f ", m1[i][j]);
              // lembrar dessa formatação de saida

            }
            System.out.println();
           }
   
   colunas já estão fixas (j = 1 e j = 3) , logo nao precisa de outro for

*/