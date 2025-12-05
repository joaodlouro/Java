package lista11.matrizes11;

public class Matrizes11Ex3 {
      
    public static void main(String[] args) {

        int m1[][]= new int [4][4];

        for(int i = 0;i < m1.length;i++){
            for(int j = 0; j < m1[i].length;j++){
                m1[i][j]=  i * j;
            }
        }

        for(int i = 0;i < m1.length;i++){
            for(int j = 0; j < m1[i].length;j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// 3. Fac¸a um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
// coluna de cada elemento. Em seguida, imprima na tela a matriz.
