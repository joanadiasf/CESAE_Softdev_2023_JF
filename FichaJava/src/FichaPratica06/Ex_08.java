package FichaPratica06;

import java.util.Scanner;

public class Ex_08 {

    /**
     * Faz uma matriz ao somar os elementos da mesma posição de duas matrizes
     *
     * @param matriz1 - matriz 1
     * @param matriz2 - matriz 2
     */
    public static void somarMatrizes (int [][]matriz1, int [][]matriz2){

        //receber 2 matrizes
        //somar os elementos nas posições
        //return de matriz nova

        //matriz (com o mesmo tamanho que as outras) que vai receber os valores
        int [][] matrizSoma = new int[matriz1.length][matriz1[0].length];

        for (int l=0; l < matrizSoma.length; l++){

            for (int c=0; c < matrizSoma[0].length;c++){

                matrizSoma[l][c]= matriz1[l][c] + matriz2[l][c];

            }
        }

        //para apresentar a matriz

        String strg = "";

        //pra ler matriz e por nrs seguidos
        for (int l=0; l <matrizSoma.length; l++){
            for (int c =0; c <matrizSoma[0].length; c++){

                strg += matrizSoma[l][c] + "\t";
            }
            strg += "\n";
        }

        //imprimir FORA do for para so aparecer o que se quer
        System.out.println("\n");
        System.out.println(strg);


    }

    /**
     * Faz o somatório dos elementos de duas matrizes
     * @param matriz1 - matriz 1
     * @param matriz2 - matriz 2
     */
    public static void somatorioMatrizes(int [][]matriz1, int [][]matriz2){

        int somatorio1=0,somatorio2=0;

        //somar elementos matriz 1
        for (int l=0; l < matriz1.length; l++){

            for (int c=0; c < matriz1[0].length; c++){

             somatorio1= somatorio1 + matriz1[l][c];
            }
        }

        //somar elementos matriz 2
        for (int l=0; l < matriz2.length; l++){

            for (int c=0; c < matriz2[0].length; c++){

                somatorio2= somatorio2 + matriz1[l][c];
            }
        }

        //somar somatorios e apresentar
        somatorio2= somatorio2+somatorio1;

        System.out.println(somatorio2);

    }

    //programa

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declarar num pra linha e coluna
        int linha,coluna;


        System.out.println("Insira o numero de linhas das matrizes: ");
        linha= input.nextInt();

        System.out.println("Insira o numero de colunas das matrizes: ");
        coluna= input.nextInt();

        //declarar matrizes de acordo com info dada
        int [][] matriz1= new int [linha][coluna];
        int [][] matriz2= new int [linha][coluna];

        //matriz1

        System.out.println("\n1ª Matriz:");
        for (int l=0; l < matriz1.length; l++){

            for (int c=0; c < matriz1[0].length; c++){

                System.out.println("Insira os elementos");
                matriz1[l][c] = input.nextInt();

            }
        }

        //matriz2

        System.out.println("\n2ª Matriz: ");
        for (int l=0; l < matriz2.length; l++){

            for (int c=0; c < matriz2[0].length; c++){

                System.out.println("Insira os elementos");
                matriz2[l][c] = input.nextInt();

            }
        }

        //função soma e apresentação

        System.out.println("A soma das suas matrizes dá a seguinte matriz:");
        somarMatrizes(matriz1,matriz2);

        //função somatório e apresentação
        System.out.println("\nO somatório dos elemntos das matrizes é:");
        somatorioMatrizes(matriz1,matriz2);


    }
}
