package Jogo.SalasJogo;

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
    public static void sala4() throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\nO Jogador tem uma sensação estranha...");
        System.out.println("\n1- Tomar outra direção \t 2- Seguir mesmo caminho");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("O Jogador vai em direção ao Pantano do Ogre");

                //sala5
                sala5();
                break;

            case 2:

                System.out.println("O Cão aponta na direção do vulcão.");
                System.out.println("O Jogador acha então que os instintos do Cão devem estar corretos e segue caminho...");

                sleep(300);
                System.out.println("\nCaminhando...");
                sleep(300);
                System.out.println("Caminhando......");
                sleep(300);


                escolhaCao();

                break;

            default:
                System.out.println("Opção inválida...");
        }


    }

    /**
     * Momento de escolha
     * @throws InterruptedException - sleep method
     */
    public static void escolhaCao() throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao,rest;

        System.out.println("\nMais à frente vê uma velhinha que corre na direção do cão e o tenta matar");
        System.out.println("\n1- Deixar o Cão morrer \t 2- Salvar o Cão");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:
                //todo: da mais contexto
                System.out.println("A velha informa das intenções malignas do cão... Indica o caminho certo");

                //sala5
                sala5();
                break;

            case 2:
                //todo: add batalha
                //todo: if vendedor continua senao para o jogo

                System.out.println("\nQuer descansar?");
                System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

                System.out.println("\nOpção: ");
                rest=input.nextInt();

                switch (rest){

                    case 1:

                        //sala 6
                        sala6();

                        break;

                    case 2:

                        sleep(300);
                        System.out.println("Recuperou 10 de vida!");
                        //todo: add vida
                        sleep(300);


                        //sala 6
                        sala6();

                        break;

                    case 3:

                        sleep(500);
                        System.out.println("Recuperou 20 de vida!");
                        //todo: add vida
                        sleep(500);

                        //sala 6
                        sala6();

                        break;

                    default:
                        System.out.println("Opção inválida...");
                }

                //sala 6
                sala6();

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }
}
