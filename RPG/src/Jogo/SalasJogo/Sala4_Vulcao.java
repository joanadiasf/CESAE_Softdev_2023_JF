package Jogo.SalasJogo;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.Sala5_Pantano.sala5;
import static Jogo.SalasJogo.Sala6_Torre.sala6;
import static java.lang.Thread.sleep;

public class Sala4_Vulcao {

    /**
     * Sala 4
     * @throws InterruptedException - sleep method
     */
    public static void sala4(Herois heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\n" + heroi.getNome() + " tem uma sensação estranha...");
        System.out.println("\n1- Tomar outra direção \t 2- Seguir mesmo caminho");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println(heroi.getNome() + " vai em direção ao Pantano do Ogre");

                //sala5
                sala5(heroi);
                break;

            case 2:

                System.out.println("O Cão aponta na direção do vulcão.");
                System.out.println(heroi.getNome() + " acha então que os instintos do Cão devem estar corretos e segue caminho...");

                sleep(300);
                System.out.println("\nCaminhando...");
                sleep(300);
                System.out.println("Caminhando......");
                sleep(300);


                escolhaCao(heroi);

                break;

            default:
                System.out.println("Opção inválida...");
        }


    }

    /**
     * Momento de escolha
     * @throws InterruptedException - sleep method
     */
    public static void escolhaCao(Herois heroi) throws InterruptedException, FileNotFoundException {

        System.out.println("\n * * * * * * * ");
        System.out.println("* V U L C Ã O *");
        System.out.println(" * * * * * * * ");

        Scanner input = new Scanner(System.in);
        int opcao,rest;

        System.out.println("\nMais à frente vê uma velhinha que corre na direção do cão e o tenta matar");
        System.out.println("\n1- Deixar o Cão morrer \t 2- Salvar o Cão");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("\n** Oh meu filho... Nem sabes do que te livrei... Este Cão é o ajudante do Senhor Shrek, o Ogre que ");
                System.out.println("mandou raptar a princesa! Ele ia te tramar e eventualmente matar.  Se fosse a ti dava meia volta e ia por outro caminho!");
                System.out.println("Pelo Pantano talvez.");;


                //sala5
                sala5(heroi);
                break;

            case 2:

                NPC velhota = new NPC("Velhota",60,25,15);
                //batalha
                heroi.batalha(velhota);


                System.out.println("\nQuer descansar?");
                System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

                System.out.println("\nOpção: ");
                rest=input.nextInt();

                switch (rest){

                    case 1:

                        //sala 6
                        sala6(heroi);

                        break;

                    case 2:

                        sleep(300);
                        System.out.println("Recuperou 10 de vida!");
                        heroi.setHP(heroi.getHP()+10);
                        sleep(300);


                        //sala 6
                        sala6(heroi);

                        break;

                    case 3:

                        sleep(500);
                        System.out.println("Recuperou 20 de vida!");
                        heroi.setHP(heroi.getHP()+20);
                        sleep(500);

                        //sala 6
                        sala6(heroi);

                        break;

                    default:
                        System.out.println("Opção inválida...");
                }

                //sala 6
                sala6(heroi);

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }
}
