package lista11.vetores11;

import utils.MostrarVetores;

public class listaex22 {
    public static void main(String[] args) {

        int v1 [] = new int [10];
        int v2 [] = new int [10];
        int v3 [] = new int [10];
        
        System.out.println("Valores para v1");
        MostrarVetores.PrencherVetorInt(v1);
        System.out.println("valores para v2");
        MostrarVetores.PrencherVetorInt(v2);

        for(int i = 0;i < v1.length;i++){

             if( i % 2 ==0){
                v3[i]= v1[i];
             }else{ v3[i] = v2[i];
             }
        }
        
        MostrarVetores.mostraVetor(v1);

        System.out.println("---------------");

        MostrarVetores.mostraVetor(v2);

        System.out.println("---------------");

         MostrarVetores.mostraVetor(v3);


    }
    
}

/*
Fac¸a um programa que leia dois vetores de 10 posic¸ ˜oes e calcule outro vetor contendo,
nas posic¸ ˜oes pares os valores do primeiro e nas posic¸ ˜oes impares os valores do se-
gundo.

*/
