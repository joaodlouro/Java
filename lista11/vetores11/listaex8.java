package lista11.vetores11;

import utils.MostrarVetores;

public class listaex8 {
    public static void main(String[] args) {


        int []v1 = new int [6];
        
        MostrarVetores.PrencherVetorInt(v1);

     System.out.println("--------------");

        for(int i = v1.length -1; i >= 0 ; --i){
            /*
            Se o vetor começa no índice 0 e termina no length - 1,
            para inverter basta começar do fim. ir v1.length até i >= 0 ”
            */
          
                  System.out.println(v1[i]);

    

        }






    }
    
}


/*
rie um programa que l ˆe 6 valores inteiros e, em seguida, mostre na tela os valores lidos
na ordem inversa


*/