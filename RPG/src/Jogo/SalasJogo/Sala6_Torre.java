package Jogo.SalasJogo;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.CharacterScreen.morte;
import static java.lang.Thread.sleep;

public class Sala6_Torre {

    /**
     * Sala 6
     * @throws InterruptedException - sleep method
     */
    public static void sala6(Herois heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao,rest;

        System.out.println("\nFinalmente... " + heroi.getNome() + " chega à torre... Está a chegar a hora da batalha final");
        System.out.println("\n1- Sala Misteriosa \t 2- Escadaria");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                NPC cofre = new NPC("Cofre",70,30,40);

                System.out.println("\n * * * * * * * * * * * * * * * * ");
                System.out.println("* S A L A   M I S T E R I O S A *");
                System.out.println(" * * * * * * * * * * * * * * * * ");

                System.out.println("\nAo chegar à sala o jogador viu um grande cofre...");
                System.out.println("Ao aproximar-se ele transforma-se num monstro!!!");

                //batalha
                heroi.batalha(cofre);

                System.out.println("\nQuer descansar?");
                System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

                System.out.println("\nOpção: ");
                rest=input.nextInt();

                switch (rest){

                    case 1:
                        System.out.println("\n" + heroi.getNome() + " sai da sala e segue a Escadaria");
                        System.out.println("\nNo fundo da Escadaria encontra-se o Quarto da Princesa...");
                        System.out.println("\n" + heroi.getNome() + " entra cuidadosamente.");

                        System.out.println("\nDeitado na cama encontra-se um Goblin gigante vestido de princesa, o cão começa a ladrar e o Goblin diz:");
                        System.out.println("** “Com que então foste tu que aceitaste aquela missão... Cão.... Queres fazer as honras?” **");

                        morte();

                        break;

                    case 2:

                        sleep(300);
                        System.out.println("Recuperou 10 de vida!");
                        heroi.setHP(heroi.getHP()+10);
                        sleep(300);

                        System.out.println("\n" + heroi.getNome() + " sai da sala e segue a Escadaria");
                        System.out.println("\nNo fundo da Escadaria encontra-se o Quarto da Princesa...");
                        System.out.println("\n" + heroi.getNome() + " entra cuidadosamente.");

                        System.out.println("\nDeitado na cama encontra-se um Goblin gigante vestido de princesa, o cão começa a ladrar e o Goblin diz:");
                        System.out.println("** “Com que então foste tu que aceitaste aquela missão... Cão.... Queres fazer as honras?” **");

                        morte();

                        break;

                    case 3:

                        sleep(500);
                        System.out.println("Recuperou 20 de vida!");
                        heroi.setHP(heroi.getHP()+20);
                        sleep(500);

                        System.out.println("\n" + heroi.getNome() + " sai da sala e segue a Escadaria");
                        System.out.println("\nNo fundo da Escadaria encontra-se o Quarto da Princesa...");
                        System.out.println("\n" + heroi.getNome() + " entra cuidadosamente.");

                        System.out.println("\nDeitado na cama encontra-se um Goblin gigante vestido de princesa, o cão começa a ladrar e o Goblin diz:");
                        System.out.println("** “Com que então foste tu que aceitaste aquela missão... Cão.... Queres fazer as honras?” **");

                        morte();

                        break;

                    default:
                        System.out.println("Opção inválida...");
                }

                break;

            case 2:

                System.out.println("\n * * * * * * * * * * ");
                System.out.println("* E S C A D A R I A *");
                System.out.println(" * * * * * * * * * * ");

                System.out.println("\nNo fundo da Escadaria encontra-se o Quarto da Princesa...");
                System.out.println("\n" + heroi.getNome() + " entra cuidadosamente.");

                sleep(400);

                System.out.println("\n * * * * * * * * * * * * * * * * * *");
                System.out.println("* Q U A R T O  D A  P R I N C E S A *");
                System.out.println(" * * * * * * * * * * * * * * * * * *");

                System.out.println("\nDeitado na cama encontra-se um Goblin gigante vestido de princesa, o cão começa a ladrar e o Goblin diz:");
                System.out.println("** “Com que então foste tu que aceitaste aquela missão... Cão.... Queres fazer as honras?” **");

                morte();

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }
}
