package lista11.vetores11;
import utils.MostrarVetores;
import java.util.Scanner;

public class listaex12 {
    public static void main(String[] args) {
        
        int []v1 = new int [5];
         
    
        MostrarVetores.PrencherVetorInt(v1);

        int menorNumero= v1[0] ;//LEMBRAR!!!  
        int maiorNumero = v1[0];//LEMBRAR!!!  
        int soma =0;
        double media= 0;

         for(int i = 0; i < v1.length;i++){

            if(v1[i] > maiorNumero){
                maiorNumero= v1[i];

            }

            if(v1[i] < menorNumero){
                menorNumero = v1[i];

            }

            soma += v1[i];

         }

         media = (double) soma / v1.length;

        MostrarVetores.mostraVetor(v1);

        System.out.println("--------------");
            
        System.out.println("Maior numero == "+maiorNumero);

        System.out.println("--------------");

        System.out.println("Menor numero == " +menorNumero);
         System.out.println("--------------");

         System.out.println("Media dos valores do vetor== "+ media);

         



    }
    
}

/*
 Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos
juntamente com o maior, o menor e a m ´edia dos valores.

*/
