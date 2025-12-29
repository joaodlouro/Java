package lista11.vetores11;
import utils.MostrarVetores;

public class listaex15 {
    public static void main(String[] args) {
        
        int [] v1 = new int [20];

        MostrarVetores.PrencherVetorInt(v1);        

       
        for(int i = 0;i < v1.length;i++){       
             boolean valorigual = false;

        for    (int j = 0; j < i;j++){

                if(v1[i] == v1[j]){
                    valorigual = true;
                    break;

                }

            

            }

            if(!valorigual){
                System.out.println(v1[i] + " ");

            }

          

        }






    }
    
}
/*
Leia um vetor com 20 n ´umeros inteiros. Escreva os elementos do vetor eliminando ele-
mentos repetidos.
*/