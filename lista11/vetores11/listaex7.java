package lista11.vetores11;
import utils.MostrarVetores;

public class listaex7 {
    public static void main(String[] args) {
     

         int [] v1 = new int[3];

         MostrarVetores.PrencherVetorInt(v1);

         MostrarVetores.mostraVetor(v1);

         int posição= 0;

         System.out.println("----------------------------");
         
         int MaiorElementov1 = v1[0];

         for(int i =0;i < v1.length;i ++){

            if(v1[i] > MaiorElementov1){
                MaiorElementov1 = v1[i];
                  posição = i;
               
            }
           

         }


         System.out.println("Mair elemento de v1 == " + MaiorElementov1);

         System.out.println("maior valor está na posição: "+ posição);

    }
    
}

/*
Escreva um programa que leia 10 n ´umeros inteiros e os armazene em um vetor. Imprima
o vetor, o maior elemento e a posic¸ ˜ao que ele se encontra.

*/