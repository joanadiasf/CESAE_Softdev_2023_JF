package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_07 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel para ser o nr introduzido
        // + contador p/ contar x repetido
        int numinsere,contador=0,retiro;


        //Input do nr para saber nr de elementos
        System.out.print("Quantos elementos quer inserir no Vetor? ");
        numinsere = input.nextInt();

        //criação do vetor com int [variavel] para o tamanho do vetor ser o mesmo que o nr dado
        int [] vetor = new int [numinsere];

        //vetor fica com tamanho do input e lê

        for (int l = 0; l < vetor.length; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();

        }

        //pedir utilizador nr p/ retirar do vetor
        System.out.print("Qual o elemento que pretende remover? ");
        retiro = input.nextInt();


        //contador vai contar quantas vezes o nr pretendido se repete/ou se se repete
        for (int l = 0; l < vetor.length; l++){

            if (retiro == vetor[l]){

                contador++;

            }

        }
        System.out.println("\n O nr repete-se: " + contador + "x.");


        //informar se o nr não estiver presente no vetor
                if (contador==0){
                    System.out.println("O número pretendido não se encontra presente...");
                }

        //novo vetor para conter os vetores não repetidos
        int pausa=0;
        int [] vetor2 = new int[numinsere-contador];



        for (int l = 0; l < vetor2.length; l++){

            if (retiro==vetor[l]){

                pausa++;

            }
            vetor2[pausa]=vetor[l];


            System.out.println("Vetor [" + l + "]: " + vetor2[pausa]);

        }




    }
}
