package loops;
import java.util.Scanner;

public class quadradocompleto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dê um valor para o tamanho do quadrado:");
        int quadrado = sc.nextInt();

        System.out.println("Dê o valor para o tamanho do furo:");
        int furo = sc.nextInt();

        int meio = quadrado / 2;

        for (int i = 0; i < quadrado; i++) {
            for (int j = 0; j < quadrado; j++) {
                if (
                    i >= meio - furo / 2 && i < meio + (furo + 1) / 2 &&
                    j >= meio - furo / 2 && j < meio + (furo + 1) / 2
                ) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
