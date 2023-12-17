package Jogo.SalasJogo;

import java.util.Scanner;

import static Jogo.SalasJogo.Sala4_Vulcao.sala4;
import static Jogo.SalasJogo.Sala8_Masmorras.sala8;
import static java.lang.Thread.sleep;

public class Sala7_Cabana {

    /**
     * Sala 7
     * @throws InterruptedException - sleep method
     */
    public static void sala7() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int rest;

        System.out.println("\nUm Goblin que estava a roubar a cabana viu o Jogador e achou que era o morador e ataca!");

        //todo: add batalha

        //todo: if vendedor continua senao para o jogo

        System.out.println("\nAo vasculhar na Cabana o Jogador encontra uma Poção Cura!!");
        System.out.println("\n Poção Cura adquirida");


        System.out.println("\nQuer descansar?");
        System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

        System.out.println("\nOpção: ");
        rest=input.nextInt();

        switch (rest){

            case 1:


                //sala8
                sala8();

                break;

            case 2:

                sleep(300);
                System.out.println("Recuperou 10 de vida!");
                //todo: add vida
                sleep(300);


                //sala8
                sala8();

                break;

            case 3:

                sleep(500);
                System.out.println("Recuperou 20 de vida!");
                //todo: add vida
                sleep(500);

                //sala8
                sala8();

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }
}
