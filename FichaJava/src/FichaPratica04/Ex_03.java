package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //Declarar + ler variáveis
        int numero,tentativa,contador=1,espaco;

        System.out.println(" Jogador 1: Escolha um número! (De 0 a 100): \n");
        numero = input.nextInt();


        for (espaco =0; espaco <= 25; espaco++){

            System.out.println();
        }

        System.out.println("Jogador 2: Adivinha o número: ");
        tentativa = input.nextInt();


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

        if (tentativa==numero){

            System.out.println("ACERTOU!!");
            System.out.println("Número de tentativas: " + contador);
        }




        }



    }


