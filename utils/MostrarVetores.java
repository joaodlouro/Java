package utils;
import java.util.Scanner;

public class MostrarVetores {

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

          //outro metodo para ln
         public static void mostraVetorLn(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
       
  
    }

    public static void MostrarVetoresDouble (double [] v){

        for(int i =0; i < v.length;i++){
            System.out.println(v[i]);

        }
    }

    public static void PrencherVetorInt (int[]v){
       
        Scanner sc= new Scanner(System.in);


     for(int i=0;i < v.length;i++){
        v[i]= sc.nextInt();

     }



    }

    public static void PrencherVetorDouble (double[]v){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i < v.length;i++){
            v[i] = sc.nextDouble();
        }
    }



}



 

    


 