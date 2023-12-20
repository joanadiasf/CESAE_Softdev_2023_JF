package Jogo.SalasJogo;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;
import Entidades.Vendedor;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.Morte.morte;
import static Jogo.SalasJogo.Sala2_PortaTaberna.sala2;


public class Sala1_Taberna1 {

    /**
     * Sala 1
     */
    public static void sala1_Inicio() throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;

        //todo: add mais contexto
        //todo: add sleep method para estetica

        System.out.println();
        System.out.println("Numa terra distante, onde existem ogres e dragões, o nosso Jogador passa por tempos dificeis...");
        System.out.println("Toda a sua famila morreu num incendio, no qual ele perdeu também todas as suas posses.");
        System.out.println("Pobre, triste, sozinho e quase sem dinheiro ( já disse pobre? ), o jogador tenta procurar trabalho na Taberna local...");


        System.out.println("\n * * * * * * *");
        System.out.println("* T A V E R N A *");
        System.out.println(" * * * * * * * *");


        System.out.println("\n1- Ir direto ao JobBoard");
        System.out.println("2- Mandar um berro para chamar a atenção");
        System.out.println("3- Perguntar ao taberneiro se ele sabe de trabalhos na área");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("\nO Jogador dirige-se até ao JobBoard e encontra apenas um panfleto...");
                System.out.println("** “Procura-se aventureiro para salvar a filha do Rei!");
                System.out.println("Suspeita-se que esta se encontre presa numa torre alta guardada por um dragão...” **");
                System.out.println("Ao lado encontra-se um mapa....");

                System.out.println("\n* * * * * M A P A   A D Q U I R I D O * * * * *");
                //todo:add mapa ao inventario

                System.out.println("\nO Taberneiro dirige-se ao jogador e diz:");
                System.out.println("** “Já percebi que tens a coragem necessária... Mas antes de ires....” **");
                System.out.println("O taberneiro abre uma caixa. ** “Isto é a minha loja secreta...");
                System.out.println("O que queres comprar?” **");

                //todo: interação com vendedor



                //sala 2
                sala2();

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

                System.out.println("\n* * * * * M A P A   A D Q U I R I D O * * * * *");
                //todo:add mapa ao inventario

                System.out.println("\nO Taberneiro dirige-se ao jogador e diz:");
                System.out.println("** “Já percebi que tens a coragem necessária... Mas antes de ires....” **");
                System.out.println("O taberneiro abre uma caixa. ** “Isto é a minha loja secreta...");
                System.out.println("O que queres comprar?” **");

                //todo: interação com vendedor


                //sala 2
                sala2();
                break;

            default:
                System.out.println("Opção inválida...");
        }


    }


}
