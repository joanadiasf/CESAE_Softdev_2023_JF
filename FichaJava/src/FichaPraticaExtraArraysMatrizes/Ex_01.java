package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int [] vetor = new int[14];

        //Input no vetor

        for (int l = 0; l < 14; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();

        }

        //ler na consola

        for (int l = 0; l < 14; l++){

            System.out.println(vetor[l]);
            
        }

    }
}
