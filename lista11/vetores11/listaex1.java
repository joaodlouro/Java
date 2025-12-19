package lista11.vetores11;
import utils.MostrarVetores;

class listaex1{
    public static void main(String[] args) {

       int [] v1= {1, 0, 5, -2, -5, 7};
       int soma = 0;

        soma = v1[0] + v1[1] + v1[5];
        v1[4] = 100;

       for(int i =0;i < v1.length;i++){
       System.out.println(v1[i]);
       }
        
       System.out.println("----------------");
       System.out.println(soma);



    }
}



// 1. Fac¸a um programa que possua um vetor denominado A que armazene 6 n ´umeros intei-
// ros. O programa deve executar os seguintes passos:
// (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
// (b) Armazene em uma vari ´avel inteira (simples) a soma entre os valores das posic¸ ˜oes
// A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
// (c) Modifique o vetor na posic¸ ˜ao 4, atribuindo a esta posic¸ ˜ao o valor 100.
// (d) Mostre na tela cada valor do vetor A, um em cada linha