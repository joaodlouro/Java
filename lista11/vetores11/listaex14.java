package lista11.vetores11;
import utils.MostrarVetores;

public class listaex14 {
    public static void main(String[] args) {

        int[] v1 = new int[4];
        MostrarVetores.PrencherVetorInt(v1);

        boolean existem = false;

        for(int i =0; i < v1.length;i++){
            for(int j = i +1;j < v1.length; j++){

                if(v1[i] == v1 [j]){

                    System.out.println("encontrou" + v1[i]);
                        existem = true;

                }
         

            }

        }

        if(!existem){
            System.out.println("Sem valores repetidos em v1");

        }

        MostrarVetores.PrencherVetorInt(v1);


       
            
    }
}

/*
 Fac¸a um programa que leia um vetor de 10 posic¸ ˜oes e verifique se existem valores iguais
e os escreva na tela

*/
