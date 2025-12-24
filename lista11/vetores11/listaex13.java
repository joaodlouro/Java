package lista11.vetores11;
import utils.MostrarVetores;

public class listaex13 {
    public static void main(String[] args) {

        int [] v1 = new int [5];        

       MostrarVetores.PrencherVetorInt(v1);
         int maiorValor = v1[0];
         int posicaoMaior = 0;  
         int menorValor = v1[0];
         int posicaoMenor = 0;  

        for(int i = 0;i < v1.length;i++){

            if(v1[i] > maiorValor){

                maiorValor = v1[i];
                posicaoMaior = i;
                
            }

            if(v1[i] < menorValor){
                menorValor = v1[i];
                posicaoMenor = i;

            }

        }

        System.out.println("-------------");
        System.out.println("Maior valor de v1 == "+maiorValor +" Está na posição " + posicaoMaior);
        System.out.println("-------------");
        System.out.println("Menor valor de v1 == "+menorValor+" Está na posição: " + posicaoMenor);
        System.out.println("-------------");


        
    }
    
}

/*
Fazer um programa para ler 5 valores e, em seguida, mostrar a posic¸ ˜ao onde se encon-
tram o maior e o menor valor.

*/
