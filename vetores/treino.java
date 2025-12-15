package vetores;
import java.util.Scanner;
import java.security.SecureRandom;
import utils.MostrarMatrizes;
public class treino {
    public static void main(String[] args) {

      
        int [][] valor = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

     int resultado =0;

     
            for(int k =0; k < 3; k++){
            resultado += valor[1][k] * valor [k][2];            
               

            }

        




     System.out.println(resultado);




    }
}
        
//new == criar objeto

// tamanho / largura do vetor

// tudo que vale para vetores, também vale para Matrizes!
