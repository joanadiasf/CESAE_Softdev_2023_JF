package Jogo.SalasJogo;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.Sala4_Vulcao.sala4;
import static Jogo.SalasJogo.Sala8_Masmorras.sala8;
import static java.lang.Thread.sleep;

public class Sala7_Cabana {

    /**
     * Sala 7
     * @throws InterruptedException - sleep method
     */
    public static void sala7(Herois heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int rest;

        System.out.println("\n * * * * * * * ");
        System.out.println("* C A B A N A *");
        System.out.println(" * * * * * * * ");


        NPC goblin = new NPC("Goblin",40,10,5);
        System.out.println("\nUm Goblin que estava a roubar a cabana viu" + heroi.getNome() + " e achou que era o morador e ataca!");

        //batalha
        heroi.batalha(goblin);


        System.out.println("\nAo vasculhar na Cabana, " + heroi.getNome() + " encontra uma Poção Cura!!");
        System.out.println("\n Poção Cura adquirida");


        System.out.println("\nQuer descansar?");
        System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

        System.out.println("\nOpção: ");
        rest=input.nextInt();

        switch (rest){

            case 1:


                //sala8
                sala8(heroi);

                break;

            case 2:

                sleep(300);
                System.out.println("Recuperou 10 de vida!");
                heroi.setHP(heroi.getHP()+10);
                sleep(300);


                //sala8
                sala8(heroi);

                break;

            case 3:

                sleep(500);
                System.out.println("Recuperou 20 de vida!");
                heroi.setHP(heroi.getHP()+20);
                sleep(500);

                //sala8
                sala8(heroi);

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }
}
