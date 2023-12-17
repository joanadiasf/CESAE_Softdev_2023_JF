package Jogo.SalasJogo;

import java.util.Scanner;

import static Jogo.SalasJogo.Sala7_Cabana.sala7;
import static Jogo.SalasJogo.Sala8_Masmorras.sala8;
import static java.lang.Thread.sleep;

public class Sala5_Pantano {

    /**
     * Sala 5
     * @throws InterruptedException - sleep method
     */
    public static void sala5() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int opcao,rest;

        System.out.println("\nO Jogador avista uma cabana...");
        System.out.println("\n1- Entrar \t 2- Não entrar");
        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                //sala7
                sala7();

                break;

            case 2:
                System.out.println("O jogador escolheu o caminho entre as árvores...");

                sleep(300);
                System.out.println("Caminhando...");

                sleep(500);
                System.out.println("Caminhando......");

                sleep(600);
                System.out.println("O caminho foi bastante seguro! O Jogador achou mantimentos.");

                //todo: add comida inventario Jogador

                //sala8
                sala8();

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }
}
