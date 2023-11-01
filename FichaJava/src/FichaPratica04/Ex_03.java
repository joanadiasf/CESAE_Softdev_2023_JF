package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //Declarar + ler variáveis

        //numero para o nr que o jog1 vai dar input | tentativa para a tentativa do jog2 |
        //contador para contar as tentativas do jog2 | espaço para o jog2 nao ver o input do jog1

        int numero,tentativa,contador=1,espaco;

        System.out.println(" Jogador 1: Escolha um número! (De 0 a 100): \n");
        numero = input.nextInt();


        //ciclo for usado quando sabemos quantas vezes vai ser repetido

        for (espaco =0; espaco <= 25; espaco++){

            System.out.println();
        }

        System.out.println("Jogador 2: Adivinha o número: ");
        tentativa = input.nextInt();


        //"while" a tentativa nao for = ao nr dado pelo jog1, o ciclo repete e dá dicas

        while (tentativa != numero){

            if (tentativa < numero) {

                System.out.println("Baixo");
            }
            if (tentativa > numero) {

                System.out.println("Alto");

            }
            tentativa = input.nextInt();
            contador++;
        }


        //jog2 acertou e diz o nr de tentativas

        if (tentativa==numero){

            System.out.println("ACERTOU!!");
            System.out.println("Número de tentativas: " + contador);
        }




        }



    }


