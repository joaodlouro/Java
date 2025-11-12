package Exercícios;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("de valor de n: ");
        int x= sc.nextInt();

        double e = 1.0;
        int potencia;
        double fatorial;

        for(int i =1 ; i <= 10; i++){
            fatorial = 1;
            potencia= 1;

            for(int j = 1;j <=i;j++){
                fatorial*=j;

            }

            for(int j=1;j<= i;j++){
                potencia *=x;

            }

            e += potencia / fatorial;



        }
        System.out.println("valor aproximado" + x + "é: " + e);


        


      


        }
    }
