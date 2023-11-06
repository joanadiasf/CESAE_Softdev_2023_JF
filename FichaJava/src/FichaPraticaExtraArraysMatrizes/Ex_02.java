package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_02 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int [] vetor = new int[10];

        //Input

        for (int l = 0; l < 10; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();

        }
        
        System.out.println(); //espaçamento

        //Apresentar na ordem inversa

        for (int l = 9; l >=0; l--){

            System.out.println(vetor[l]);

        }
    }
}
