package Jogo.SalasJogo;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.CharacterScreen.morte;
import static java.lang.Thread.sleep;
import static Jogo.SalasJogo.Sala5_Pantano.*;

public class Sala3_Taberna2 {

    /**
     * Sala 3
     * @throws InterruptedException - sleep method
     */
   public static void sala3(Herois heroi) throws InterruptedException, FileNotFoundException {

       Scanner input = new Scanner(System.in);
       int opcao1,opcao2,comida;

       sleep(500);

       System.out.println("\nApós um longo caminho o Jogador decide parar numa Taverna que encontra pelo caminho...");

       System.out.println("\n * * * * * * *");
       System.out.println("* T A V E R N A *");
       System.out.println(" * * * * * * * *");


       System.out.println("\n1- Comprar comida \t 2- Não comprar nada");
       comida= input.nextInt();

       if (comida==1){

           //todo: add comida ao inventário
           //todo: retirar dinheiro

           System.out.println("COMPROOOU");
           System.out.println("\nApós comprar comida o Jogador ouve uma discussão acessa entre dois clientes...");
       }

       else {
           System.out.println("\nOuve-se uma discussão acessa entre dois clientes...");
       }

       System.out.println("\nAjudar?");
       System.out.println("\n 1- Sim \t 2- Não");

       System.out.println("\nOpção: ");
       opcao1=input.nextInt();

       switch (opcao1){

           case 1:

               ajudaBriga(heroi);


               break;

           case 2:

               System.out.println("\nComo não é nada com o jogador ele vai ao Taverneiro e pergunta se");
               System.out.println("ele sabe onde está a princesa.  Ele diz-lhe que ela está no fundo ");
               System.out.println("da masmorra que se encontra no pantano do Ogre...");

               //sala5
               sala5(heroi);

               break;

           default:
               System.out.println("Opção inválida...");
       }
   }

    /**
     * Opção de Ajudar na luta
     * @throws InterruptedException - sleep method
     */
   public static void ajudaBriga(Herois heroi) throws InterruptedException, FileNotFoundException {

       Scanner input = new Scanner(System.in);
       int opcao,rest;

       System.out.println("\nQuem ajudar?");
       System.out.println("1- Pequeno Indefeso \t 2-Grandalhão");

       System.out.println("\nOpção: ");
       opcao= input.nextInt();

       switch (opcao){

           case 1:
                NPC grandalhao = new NPC("Grandalhão",70,30,25);

               //batalha
               heroi.batalha(grandalhao);

               System.out.println("Que luta dificil... Mas o Pequeno Indefeso como gratidão oferece duas poções");

               System.out.println("\n Poção Cura adquirida");
               System.out.println("\n Poção Invisibilidade adquirida");

               //add poçoes inventario
               heroi.addInventario(new Pocao("Pocao Cura",0,35,0));
               heroi.addInventario(new Pocao("Pocao Invisibilidade",0,0,15));


               System.out.println("\nQuer descansar?");
               System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

               System.out.println("\nOpção: ");
               rest=input.nextInt();

               switch (rest){

                   case 1:

                       //sala 5
                       sala5(heroi);

                       break;

                   case 2:

                       sleep(300);
                       System.out.println("Recuperou 10 de vida!");
                       heroi.setHP(heroi.getHP()+10);
                       sleep(300);


                       //sala 5
                       sala5(heroi);

                       break;

                   case 3:

                       sleep(500);
                       System.out.println("Recuperou 20 de vida!");
                       heroi.setHP(heroi.getHP()+20);
                       sleep(500);

                       //sala 5
                       sala5(heroi);
                       break;

                   default:
                       System.out.println("Opção inválida...");
               }

               System.out.println("O Jogador dirige-se  ao Taverneiro e pergunta se ele sabe onde está a princesa.");
               System.out.println("Ele diz-lhe que ela está no fundo da masmorra que se encontra no pantano do Ogre...");

               //sala5
               sala5(heroi);

               break;

           case 2:

               System.out.println("Após ajudar o Grandalhão, ele continua chateado e mata o jogador...");

               morte();

               break;

           default:
               System.out.println("Opção inválida...");
       }

   }

}
