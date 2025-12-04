package utilidade;

public class MostrarMatrizes {

    public static void mostraVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


          public static void mostraVetorLn(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
       
  
    }

}



 

    


 