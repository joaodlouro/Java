package vetores;
import java.util.Scanner;
import java.security.SecureRandom;

public class treino {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);



        final int linhas = 3;
        final int colunas = 5;
        
        //vetor

        int [][] numeros = new int [linhas][colunas];
        // [0,1,2,3,4,5], 
        // [0,1,2,3,4,5],   
        // [0,1,2,3,4,5]   // Exemplo              
        
        int [] [] num = { {1,32,4,21,32}, {1,2,3,4,1},{2,3,4,1,2}};
     

       for(int i = 0; i < linhas;i++) {
        
         for(int j = 0; j < colunas; j++){
            numeros[i][j] = new SecureRandom().nextInt(100);

         }

       }
  
         ///

       /*for(int i = 0; i < linhas;i++) {
        
         for(int j = 0; j < colunas; j++){
          System.out.printf("%4d |", numeros[i][j]); 

         }
         System.out.printf("%n");

       }  */
         
         for(int[] i: num ){
            for(int valor: i){
                System.out.printf("%4d |", valor);

            }
            System.out.printf("%n");

         }
         
         
         
         
         
         

        
    
   

    }
}
        


//new == criar objeto


 // tamanho / largura do vetor
