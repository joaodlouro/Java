package loops;
import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int votosBranco = 0;
        int votosNulos = 0;
        int totalEleitores = 0;

        System.out.println("Digite o número do seu voto:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("0 - Voto em branco");
        System.out.println("-1 - Encerrar votação");

        for (;;) {
            voto = sc.nextInt();

            if (voto == -1) {
                break;
            }

            totalEleitores++;

            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else if (voto == 0) {
                votosBranco++;
            } else {
                votosNulos++;
            }
        }

        System.out.println("\n--- Resultado da Eleição ---");
        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Votos em branco: " + votosBranco);
        System.out.println("Votos nulos: " + votosNulos);

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Vencedor: Candidato 1");
        } else if (candidato2 > candidato1 && candidato2 > candidato3) {
            System.out.println("Vencedor: Candidato 2");
        } else {
            System.out.println("Vencedor: Candidato 3");
        }

        sc.close();
    }
}
