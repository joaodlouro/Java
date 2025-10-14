package loops;
 import java.util.Scanner;
public class potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
       System.out.println("Informe o expoente");
         int expoente = sc.nextInt();

        System.out.println("informe a base do expoente");
        int base= sc.nextInt();

         int res= 1;  //Expoente zero → sempre 1.

         int i = 0;

         while(i < expoente){
            res= res * base;
            i++;

            System.out.println(res);

         }


    }
    
}




