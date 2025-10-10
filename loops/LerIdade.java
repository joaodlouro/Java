// //9. Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente
// idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem
// que ser maior que 0 e menor que 150. Escrever a idade lida

package loops;


import java.util.Scanner;
public class LerIdade {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

          
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        while (idade <=0 || idade >=150 ) {

            System.out.println("idade invalida, digite novamente: ");
            idade = sc.nextInt();

        
            
        }
         System.out.println("idade valida: " + idade);

        sc.close();
        
       
    }

}








    
    

