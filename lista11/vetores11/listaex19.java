package lista11.vetores11;

import utils.MostrarVetores;

public class listaex19 {
    public static void main(String[] args) {

        int v1 [] = new int [50];
        
        for(int i = 0 ; i <v1.length;i++){

            v1[i]= (i + 5 * i)%(i + 1);

        }
        MostrarVetores.mostraVetor(v1);
    }
    
}

/*
 Fac¸a um vetor de tamanho 50 preenchido com o seguinte valor: (i + 5 ∗ i)%(i + 1), sendo
i a posic¸ ˜ao do elemento no vetor. Em seguida imprima o vetor na tela.
*/
