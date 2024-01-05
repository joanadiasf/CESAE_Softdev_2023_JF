package FichaPratica05;

import java.util.Scanner;
public class Ex_12 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor e matriz
        int []vetor1=new int[10];
        int []vetor2=new int[10];
        int [][]matriz =new int[10][2];


        //ler vetores

//vetor1 + os lugares na matriz
        System.out.println("Vetor 1: ");
        for (int l=0; l <10;l++){

            System.out.println("Insira valores " + l + ": ");

            //l - linha onde está o valor,  o vetor tem 1 coluna e 10 linhas
            vetor1[l] = input.nextInt();

            //inserir os valores no primeiro [] da matriz - 1coluna
            matriz[l][0] = vetor1[l];

        }

//vetor2 + os lugares na matriz
        System.out.println("Vetor 2: ");
        for (int l=0; l <10; l++){

            System.out.println("Insira valores " + l + ": ");

            //l - linha onde está o valor,  o vetor tem 1 coluna e 10 linhas
            vetor2[l] = input.nextInt();

            //inserir os valores na segunda [] da matriz - 2coluna
            matriz[l][1]= vetor2[l];
        }

//matriz - apresentação
        //l - linha  | c - coluna


        for (int l=0; l <10; l++){

            System.out.println();

            for (int c=0; c <2; c++){

                System.out.print(matriz[l][c]);
            }
        }

    }
}
