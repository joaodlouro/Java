package lista11.matrizes11;

public class Matrizes11Ex2 {
    public static void main(String[] args) {
        
          int m1 [][] = new int [5][5];

          for(int i = 0;i < m1.length; i++){
            for(int j = 0; j < m1[i].length;j++){
                if(i == j){
                    m1[i][j] = 1;
                } else{
                    m1[i][j]= 0;
                }
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
          }
    }
}


// 2 : Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
// elementos. Escreva ao final a matriz obtida.