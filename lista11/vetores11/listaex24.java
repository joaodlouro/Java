package lista11.vetores11;

import utils.MostrarVetores;

public class listaex24 {

    public static void main(String[] args) {
        int v1 [] = new int [3]; 
        double v2 [] = new double[3];


        MostrarVetores.PrencherVetorInt(v1);
        MostrarVetores.PrencherVetorDouble(v2);


        double menorAltura= v2[0];
        double maiorAltura=v2[0];

        int alunoMAisBaixo= v1[0];
        int alunoMaisAlto=v1[0];
        // 0 ja esta sendo considerado




        

        for(int i = 1;i < v2.length;i++){

              if(v2[i] < menorAltura){
                menorAltura = v2[i];
                alunoMAisBaixo = v1[i];

            }

            if(v2[i] > maiorAltura){
                maiorAltura = v2[i];
                alunoMaisAlto = v1[i];
                

            }     
    

        }
        
        System.out.println("--------------");
        System.out.println(maiorAltura + "nuemro: " + alunoMaisAlto);
        System.out.println("--------------");
        System.out.println(menorAltura + "numero: " + alunoMAisBaixo);
        
    }

}

/*
Fac¸a um programa que leia dez conjuntos de dois valores, o primeiro representando o
n ´umero do aluno e o segundo representando a sua altura em metros. Encontre o aluno
mais baixo e o mais alto. Mostre o n ´umero do aluno mais baixo e do mais alto, juntamente
com suas alturas.

*/
