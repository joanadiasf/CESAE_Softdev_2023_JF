package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_07 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel para ser o nr introduzido
        // + contador p/ contar x repetido
        int numinsere,contador=0,retiro;


        //Input do nr
        System.out.print("Quantos elementos quer inserir no Vetor? ");
        numinsere = input.nextInt();

        //criação do vetor com int [variavel] para o tamanho do vetor
        //ser o mesmo que o nr dado
        int [] vetor = new int [numinsere];

        //vetor fica com tamanho do input
        for (int l = 0; l < vetor.length; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();
            contador++;
        }

        //pedir utilizador nr p/ retirar do vetor
        System.out.print("Qual o elemento que pretende remover? ");
        retiro = input.nextInt();

        if (contador > 0){

            numinsere= numinsere - contador;

        }
        else {
            System.out.println("O número não está no vetor...");
        }

        vetor = new int [numinsere];
        //vetor fica com tamanho do input
        for (int l = 0; l < vetor.length; l++){

            System.out.println(vetor[l]);

        }



    }
}
