package docs;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero % 2 == 0)
        {
            System.out.println("O número " + numero + " é par.");
        }
        else
        {
            System.out.println("O número " + numero + " é ímpar.");
        }

        
    }
}
