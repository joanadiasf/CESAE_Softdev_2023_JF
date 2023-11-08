package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_05_BibliotecaEx06.*;
//importar funcoes do ex3, o * é pra ser todas as funçoes

public class Ex_06 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel para ser o nr introduzido
        int numinsere,opcao;


        //Input do nr
        System.out.print("Quantos elementos quer inserir no Vetor? ");
        numinsere = input.nextInt();

        //Declarar Vetor
        int [] vetor = new int [numinsere];

        //Vetor
        for (int l = 0; l < vetor.length; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();
        }

        //Menu com do...while
        do {
            System.out.println("7. Maior Elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Crescente ou Não Crescente");
            System.out.println("10. Sair");

            System.out.println("\nOpção");
            opcao = input.nextInt();

            switch (opcao){

                case 7:
                    System.out.println(maiorVetor(vetor));
                    break;

                case 8:
                    System.out.println(menorVetor(vetor));
                    break;

                case 9:
                   if (crescenteVetor(vetor)){
                       System.out.println("É crescente!");
                   }else {
                       System.out.println("Não é crescente");
                   }
                    break;

                default:
                    System.out.println("*| Opção inválida... |*");
            }

        }while(opcao != 10);
    }
}
