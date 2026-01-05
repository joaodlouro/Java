package lista11.vetores11;
import utils.MostrarVetores;

public class listaex17{
    public static void main(String[] args) {
        
       int v1 [] = new int [10];

       System.out.println("De valores para posições do vetor v1: ");

       MostrarVetores.PrencherVetorInt(v1);


       for(int i =0 ;i < v1.length;i++ ){
        if(v1[i] <= -1){

            v1[i] = 0;

        }

        }

               MostrarVetores.mostraVetor(v1);

       }
        
    }
/*
Leia um vetor de 10 posic¸ ˜oes e atribua valor 0 para todos os elementos que possu´ırem
valores negativos.
*/

