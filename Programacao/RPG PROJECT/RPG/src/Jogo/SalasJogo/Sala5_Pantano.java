package Jogo.SalasJogo;

import Entidades.TipoHerois.Herois;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.Sala7_Cabana.sala7;
import static Jogo.SalasJogo.Sala8_Masmorras.sala8;
import static java.lang.Thread.sleep;

public class Sala5_Pantano {

    /**
     * Sala 5
     * @throws InterruptedException - sleep method
     */
    public static void sala5(Herois heroi) throws InterruptedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao,rest;

        System.out.println("\n" + heroi.getNome() + " avista uma cabana...");
        System.out.println("\n1- Entrar \t 2- Não entrar");
        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                //sala7
                sala7(heroi);

                break;

            case 2:
                System.out.println(heroi.getNome() + " escolheu o caminho entre as árvores...");

                sleep(300);
                System.out.println("Caminhando...");

                sleep(500);
                System.out.println("Caminhando......");

                sleep(600);
                System.out.println("O caminho foi bastante seguro! " + heroi.getNome() + " achou uma Poção.");

                //add pocao inventario Jogador
                heroi.addInventario(new Pocao("Pocao de Vitamina C",0, new String[]{"Feiticeiro","Bardo","Barbaro"},20,5));


                //sala8
                sala8(heroi);

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }
}
