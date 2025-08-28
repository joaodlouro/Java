import java.util.Scanner;

public class AlgoritmoInt {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        
        System.out.print("Digite um valor inteiro:");
        int numero = in.nextInt();

        int antecessor = numero - 1;

        System.out.println("o numero antecessor de: " 
         + numero + " e " + antecessor);

        in.close();
   
}
}



