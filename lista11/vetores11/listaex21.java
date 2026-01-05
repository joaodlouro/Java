package lista11.vetores11;

import utils.MostrarVetores;


public class listaex21 {
    public static void main(String[] args) {
        
     int v1 [] = new int [10];
     int v2 [] = new int [10];
     
    MostrarVetores.PrencherVetorInt(v1);
    MostrarVetores.PrencherVetorInt(v2);
    
    int v3 [] = new int [10];
    for(int i = 0;i < v1.length;i++){
       
         v3[i] = v1[i] - v2[i];

        

    }
    
    MostrarVetores.mostraVetor(v3);




    }
    
}

/*
Fac¸a um programa que receba do usu ´ario dois vetores, A e B, com 10 n ´umeros inteiros
cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados
do vetor C.
*/