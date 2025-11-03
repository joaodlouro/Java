package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" valor de n ");
        int n = sc.nextInt();

        double fatorial = 1.0;
        double E = 1.0;

        for(int i = 1; i <= n; i++){
            fatorial *= i;
            E += 1.0 / fatorial;




        }
             

       
        sc.close();
    }
}
