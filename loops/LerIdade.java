// //9. Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente
// idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem
// que ser maior que 0 e menor que 150. Escrever a idade lida

package loops;


import java.util.Scanner;
public class LerIdade {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

     
         int idade;

        for( ;;){
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();

            if(idade <= 0 || idade >= 150){
                System.out.println("idade invalida, digite novameente");
                
                 
                 
            } else {
                System.out.println("idade valida: " + idade);
                break;


            }
                      
             
            
        }
         sc.close(); 
        
     
       
    }

}








    
    

