package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;
import utils.MostrarVetores;


public class treino {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);

           double [][] m1 = new double[2][2];
           double [][] m2 = new double[2][2];
           double [][] somamatriz1e2 = new double[2][2];
            double [][] subimatriz1e2 = new double[2][2];
           
            MostrarMatrizes.RandomMatrizDouble(m1);
            MostrarMatrizes.RandomMatrizDouble(m2);

          
           System.out.println("Esolha uma da opções emtre a, b, c e  e ");
           System.out.println("a == somar as duas matrizes");
           System.out.println("b == subtrair a primeira matriz da segunda");
           System.out.println("c == adicionar uma constante `as duas matrize ");
           System.out.println("d == mostrar matrizes");
           System.out.println("e == exit(sair)");

           while (true) {
              char abcde= sc.next().toLowerCase().charAt(0);

            if(abcde == 'e'){
              break;
            }
            
            if(abcde == 'a'){
               for(int i=0;i < 2;i++){
                for(int j =0;j<2;j++){

                somamatriz1e2[i][j] = m1[i][j] + m2[i][j];
                System.out.printf("%8.2f ", somamatriz1e2[i][j]);

                }
                System.out.println();

               } 

            }else if(abcde == 'b'){
              for(int i=0;i < 2;i++){
                for(int j =0;j<2;j++){

                subimatriz1e2[i][j] = m2[i][j] - m1[i][j];
                System.out.printf("%8.2f ", subimatriz1e2[i][j]);

                }
                System.out.println();

               } 

            }else if (abcde == 'c'){

               System.out.println("De valor da constante k");
              int  constantek = sc.nextInt();

              for(int i =0;i < 2;i++){
                for(int j =0; j < 2;j++){

                  m1[i][j] = m1[i][j] +constantek;
                  m2[i][j] = m2[i][j] +constantek;

                  System.out.print("matrizes com a constante" + m1[i][j] );
                  System.out.println("------------");
                   System.out.println( m2[i][j] );

                }
                System.out.println();

              }

            } else if(abcde == 'd'){
              MostrarMatrizes.mostraMatrizDouble(m1);
              System.out.println("-----------------");
              MostrarMatrizes.mostraMatrizDouble(m2);

            }
           }
         
         

        
         
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