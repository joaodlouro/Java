package lista11.matrizes11;
import java.util.Scanner;
import utils.MostrarMatrizes;
import utils.MostrarVetores;


public class treino {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
            
          int [][] tabuleiro = {{-1,1,1}, {-1,-1,0}, {0,1,0}};
          
        
         
              for(int i =0; i < 3;i ++){
                int soma = tabuleiro[i][0] +  tabuleiro[i][1]  + tabuleiro[i][2];

                if(soma == -2){

                  for(int j =0;j < 3;j++ ){
                     if(tabuleiro [i]
                      [j] == 0){
                        tabuleiro[i][j] = -1;
                    System.out.println("Jogada em: " + i + ", " + j);
                    break;


                     }
                     break;

                  }

                }

              }
          


        
        

  MostrarMatrizes.mostraMatriz(tabuleiro);



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

   lembrar == C[i][j]=k=0∑2​A[i][k]×B[k][j] !

*/