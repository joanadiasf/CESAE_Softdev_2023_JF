package Jogo.SalasJogo;

import Entidades.NPC;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.CharacterScreen.morte;
import static Jogo.SalasJogo.Sala3_Taberna2.sala3;
import static Jogo.SalasJogo.Sala4_Vulcao.sala4;
import static java.lang.Thread.sleep;

public class Sala2_PortaTaberna {

    /**
     * Sala 2
     */
    public static void sala2() throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\n * * * * * * * * * * * * * * * * * ");
        System.out.println("* P O R T A   D A   T A V E R N A *");
        System.out.println(" * * * * * * * * * * * * * * * * * ");

        System.out.println("\nApós analisar o mapa, o Jogador vê que há dois caminhos possíveis...");
        System.out.println("O mapa indica que o caminho correto é o da direita...");
        System.out.println("Qual pretende seguir?...");
        System.out.println("\n1- Esquerda \t 2- Direita");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:
                //esquerda
                esquerda();
                break;

            case 2:
                //direita
                direita();
                break;

            default:
                System.out.println("Opção inválida...");
        }
    }

    /**
     * Sala 2 - opção selecionada ESQUERDA
     */
    public static void esquerda() throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao,rest;


        System.out.println("\nMas o instinto do Jogador diz-lhe para ir para a esquerda...");
        System.out.println("Ao sair da cidade ele encontra um tunel...");
        System.out.println("\n1- Entrar \t 2- Não Entrar");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("\nQue estranho... O tunel está iluminado... Parece que andou aqui alguém!!");

                //inimigo
                NPC dragao = new NPC("Dragão",50,15,20);

                //todo: add batalha


                //todo: if vendedor continua senao para o jogo
                if (heroi.getHP == 0){
                    morte();
                }

                System.out.println("\nApós a primeira batalha do Jogador, ele chega ao fim do tunel...");
                System.out.println("\nQuer descansar?");
                System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

                System.out.println("\nOpção: ");
                rest=input.nextInt();

                switch (rest){

                    case 1:

                        //sala 3
                        sala3();

                        break;

                    case 2:

                        sleep(300);
                        System.out.println("Recuperou 10 de vida!");

                        //todo: add vida
                        sleep(300);


                        //sala 3
                        sala3();

                        break;

                    case 3:

                        sleep(500);
                        System.out.println("Recuperou 20 de vida!");
                        //todo: add vida
                        sleep(500);

                        //sala 3
                        sala3();

                        break;

                    default:
                        System.out.println("Opção inválida...");
                }

                //sala3
                sala3();

            break;

            case 2:

                System.out.println("\nParece tudo tão calmo...");

                sleep(200);

                System.out.println("\nDo nada salta um inimigo para a frente do Jogador!");

                //todo: add batalha

                //todo: if vendedor continua senao para o jogo

                System.out.println("\nApós a primeira batalha do Jogador, ele chega ao fim do tunel...");
                System.out.println("\nQuer descansar?");
                System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

                System.out.println("\nOpção: ");
                rest=input.nextInt();

                switch (rest){

                    case 1:

                        //sala 3
                        sala3();

                        break;

                    case 2:

                        sleep(300);
                        System.out.println("Recuperou 10 de vida!");
                        //todo: add vida
                        sleep(300);


                        //sala 3
                        sala3();

                        break;

                    case 3:

                        sleep(500);
                        System.out.println("Recuperou 20 de vida!");
                        //todo: add vida
                        sleep(500);

                        //sala 3
                        sala3();
                        break;

                    default:
                        System.out.println("Opção inválida...");
                }

                //sala3
                sala3();

            break;

            default:
                System.out.println("Opção inválida...");
        }

    }

    /**
     * Sala 2 - opção selecionada DIREITA
     */
    public static void direita() throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao,rest;

        System.out.println("\nAo sair da cidade o jogador encontra um cão abandonado e faminto...");
        System.out.println("Ele dá lhe de comer e o Cão torna-se seu companheiro.");

        System.out.println("\nMais à frente encontra dois possíveis caminhos.");
        System.out.println("** “A floresta parece suspeita... Pode ter inimigos escondidos... ");
        System.out.println("No entanto o descampado, os inimigos não têm de onde se esconder");
        System.out.println("mas eu estou mais desprotegido...”");

        System.out.println("\n1- Floresta \t 2- Descampado");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("\n * * * * * * * * * ");
                System.out.println("* F L O R E S T A *");
                System.out.println(" * * * * * * * * * ");


                sleep(300);
                System.out.println("Caminhando...");

                sleep(500);
                System.out.println("Caminhando......");

                sleep(600);
                System.out.println("O caminho foi bastante seguro! O Jogador achou mantimentos.");

                //todo: add comida inventario Jogador

                //sala 4
                System.out.println("Mais à frente o Jogador vê um vulcão");
                sala4();

                break;

            case 2:

                System.out.println("\n * * * * * * * * * * * ");
                System.out.println("* D E S C A M P A D O *");
                System.out.println(" * * * * * * * * * * * ");

                sleep(300);
                System.out.println("Caminhando...");

                sleep(500);
                System.out.println("Caminhando......");

                System.out.println("\nInimigo sai de baixo da terra!");

                //todo: add batalha

                //todo: if vendedor continua senao para o jogo

                System.out.println("\nApós a primeira batalha do Jogador, ele chega ao fim do tunel...");
                System.out.println("\nQuer descansar?");
                System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

                System.out.println("\nOpção: ");
                rest=input.nextInt();

                switch (rest){

                    case 1:

                        //sala 4
                        System.out.println("Mais à frente o Jogador vê um vulcão");
                        sala4();

                        break;

                    case 2:

                        sleep(300);
                        System.out.println("Recuperou 10 de vida!");
                        //todo: add vida
                        sleep(300);


                        //sala 4
                        System.out.println("Mais à frente o Jogador vê um vulcão");
                        sala4();

                        break;

                    case 3:

                        sleep(500);
                        System.out.println("Recuperou 20 de vida!");
                        //todo: add vida
                        sleep(500);

                        //sala 4
                        System.out.println("Mais à frente o Jogador vê um vulcão");
                        sala4();

                        break;

                    default:
                        System.out.println("Opção inválida...");
                }

                break;

            default:
                System.out.println("Opção inválida...");
        }


    }
}
