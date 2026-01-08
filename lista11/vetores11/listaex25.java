package lista11.vetores11;

import utils.MostrarVetores;


public class listaex25 {
    public static void main(String[] args) {
  

        int v1[] = new int [100];
         int numero = 1;


      for(int i =0; i < 100;){       

        if(numero % 7 != 0 && numero % 10 != 7){
            v1[i]= numero;
            i++;
        }
        
         numero++;


      }







    }
    
}

