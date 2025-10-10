// . Faça um programa que, para um número indeterminado de pessoas: leia a idade de
// cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
// considerada. A seguir calcule:
// • o número de pessoas;
// • a idade média do grupo;
// • a menor idade e a maior idade.

package loops;
import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        int totalPessoas = 0;
        int somaIdades = 0;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;

        System.out.println("Digite a idade (0 para sair): ");

        for( ;;){
            idade = sc.nextInt();

            if(idade == 0){
                break;
            }

            totalPessoas++;
            somaIdades += idade;

            if(idade < menorIdade){
                menorIdade = idade;
            }

            if(idade > maiorIdade){
                maiorIdade = idade;
            }
        }

        if(totalPessoas > 0){
            double mediaIdades = (double) somaIdades / totalPessoas;
            System.out.println("Número de pessoas: " + totalPessoas);
            System.out.printf("Idade média do grupo: %.2f%n", mediaIdades);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Maior idade: " + maiorIdade);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
        

        
        
        
    }
    
}
