package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_06 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis e vetor
        int numinsere;


        //Input
        System.out.print("Quantos elementos quer inserir no Vetor? ");
        numinsere = input.nextInt();

        int [] vetor = new int [numinsere];

        //vetor fica com tamanho do input
        for (int l = 0; l < vetor.length; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();
        }

        //Apresentar vetor
        for (int l = 0; l < vetor.length; l++){

            System.out.println(vetor[l]);
        }

    }
}
