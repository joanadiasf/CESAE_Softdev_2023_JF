package Jogo.SalasJogo;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;
import Entidades.Vendedor;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.CharacterScreen.morte;
import static Jogo.SalasJogo.Sala2_PortaTaberna.sala2;
import static java.lang.Thread.sleep;


public class Sala1_Taberna1 {

    /**
     * Sala 1
     */
    public static void sala1_Inicio(Herois heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;


        System.out.println();
        System.out.println("Numa terra distante, onde existem ogres e dragões, o nosso Jogador passa por tempos dificeis...");
        System.out.println("Toda a sua famila morreu num incendio, no qual ele perdeu também todas as suas posses.");
        System.out.println("Pobre, triste, sozinho e quase sem dinheiro ( já disse pobre? ), o jogador tenta procurar trabalho na Taberna local...");

        sleep(500);


        System.out.println("\n * * * * * * *");
        System.out.println("* T A V E R N A *");
        System.out.println(" * * * * * * * *");


        System.out.println("\n1- Ir direto ao JobBoard");
        System.out.println("2- Mandar um berro para chamar a atenção");
        System.out.println("3- Perguntar ao taberneiro se ele sabe de trabalhos na área");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        Vendedor vendedor = new Vendedor();

        switch (opcao){

            case 1:

                System.out.println("\nO Jogador dirige-se até ao JobBoard e encontra apenas um panfleto...");
                System.out.println("** “Procura-se aventureiro para salvar a filha do Rei!");
                System.out.println("Suspeita-se que esta se encontre presa numa torre alta guardada por um dragão...” **");
                System.out.println("Ao lado encontra-se um mapa....");

                //o mapa não é um item a sério, é só um adereço da história
                System.out.println("\n* * * * * M A P A   A D Q U I R I D O * * * * *");


                System.out.println("\nO Taberneiro dirige-se ao jogador e diz:");
                System.out.println("** “Já percebi que tens a coragem necessária... Mas antes de ires....” **");
                System.out.println("O taberneiro abre uma caixa. ** “Isto é a minha loja secreta...");
                System.out.println("O que queres comprar?” **");

                //interação com vendedor
                vendedor.lojaVendedor(heroi);


                //sala 2
                sala2(heroi);

                break;

            case 2:

                System.out.println("\nUm mercenário de nível 10 aproxima-se. ** “Quem é que pensas que és fracote?” **");
                System.out.println("Irritado ele mata o Jogador...");


                morte();

                break;

            case 3:

                System.out.println("\nO Taberneiro com cara de poucos amigos, aponta para o JobBoard. Este tem afixado um panfleto: ");
                System.out.println("** “Procura-se aventureiro para salvar a filha do Rei!");
                System.out.println("Suspeita-se que esta se encontre presa numa torre alta guardada por um dragão...” **");
                System.out.println("Ao lado encontra-se um mapa....");

                //o mapa não é um item a sério, é só um adereço da história
                System.out.println("\n* * * * * M A P A   A D Q U I R I D O * * * * *");

                System.out.println("\nO Taberneiro dirige-se ao jogador e diz:");
                System.out.println("** “Já percebi que tens a coragem necessária... Mas antes de ires....” **");
                System.out.println("O taberneiro abre uma caixa. ** “Isto é a minha loja secreta...");
                System.out.println("O que queres comprar?” **");

                //interação com vendedor
                vendedor.lojaVendedor(heroi);



                //sala 2
                sala2(heroi);
                break;

            default:
                System.out.println("Opção inválida...");
        }


    }


}
