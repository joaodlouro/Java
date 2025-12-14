package lista11.matrizes11;
import utils.MostrarMatrizes;
import java.util.Scanner;

public class Matrizes11Ex21 {
    public static void main(String[] args) {
          
        Scanner sc= new Scanner (System.in);

         double [][] mA  = new double[2][2];
         double [][] mB  = new double[2][2];
         double [][] mC =  new double [2][2];


        MostrarMatrizes.DoubleNumerosMatriz(mA);
        MostrarMatrizes.DoubleNumerosMatriz(mB);
        
        System.out.println("Escolha uma opcao entre 1 e 4: ");
        int op = sc.nextInt();   //opção

        if(op==1){

            for(int i =0 ; i < 2;i++){
                for(int j = 0; j < 2;j++ ){
                    mC[i][j] = mA[i][j] + mB[i][j];       
                }

            }
            MostrarMatrizes.mostraMatrizDouble(mC);
            


        }else if (op==2){

            for(int i =0; i < 2; i++){
                for(int j =0;j < 2;j++){
                    mC[i][j]= mB[i][j] - mA[i][j];
                }

            }

            MostrarMatrizes.mostraMatrizDouble(mC);
        
        } else if(op ==3){
            double constante = sc.nextDouble();

             for(int i = 0; i < 2 ; i++){
                for(int j = 0; j < 2 ; j++){

                 mA[i][j] = mA[i][j] + constante;
                 mB[i][j] = mB[i][j] + constante;


                }
                
             }
             MostrarMatrizes.mostraMatrizDouble(mA);
             MostrarMatrizes.mostraMatrizDouble(mB);


        }else if(op==4){
                MostrarMatrizes.mostraMatrizDouble(mA);
                MostrarMatrizes.mostraMatrizDouble(mB);

            

            }


    }    
}



/*
Fac¸a um programa que leia duas matrizes 2 x 2 com valores reais. Oferec¸a ao usu ´ario
um menu de opc¸ ˜oes:
(a) somar as duas matrizes
(b) subtrair a primeira matriz da segunda
(c) adicionar uma constante `as duas matrizes
(d) imprimir as matrizes
Nas duas primeiras opc¸ ˜oes uma terceira matriz 3 x 3 deve ser criada. Na terceira opc¸ ˜ao
o valor da constante deve ser lido e o resultado da adic¸ ˜ao da constante deve ser arma-
zenado na pr ´opria matriz.
 
*/
