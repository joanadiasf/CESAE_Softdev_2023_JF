package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_03 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis e vetor
        int [] vetor = new int[10];

        int numverifica,apresenta=0;

        //Input
        for (int l = 0; l < 10; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();

        }

        System.out.println(); //espaçamento

        //Pesquisa do nr no vetor

        System.out.print("Qual o número que quer pesquisar? ");
        numverifica = input.nextInt();

        for (int l = 0; l < 10; l++){

            //verificar quantas vezes se repete
            if (numverifica==vetor[l]){

                apresenta++;
            }

        }

        //apresentar resposta
        if (apresenta > 0){

            System.out.println(numverifica + " aparece " + apresenta + "x.");

        }else {

            System.out.println(numverifica + " não aparece no vetor...");
        }

    }
}
