package Jogo.SalasJogo;

import java.util.Scanner;

import static java.lang.Thread.sleep;
import static Jogo.SalasJogo.Sala5_Pantano.*;

public class Sala3_Taberna2 {

    /**
     * Sala 3
     * @throws InterruptedException - sleep method
     */
   public static void sala3() throws InterruptedException {

       Scanner input = new Scanner(System.in);
       int opcao1,opcao2,comida;

       //todo: add mais contexto
       //todo: add sleep method para estetica

       System.out.println("\nApós um longo caminho o Jogador decide parar numa Taverna que encontra pelo caminho...");

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

               ajudaBriga();


               break;

           case 2:

               System.out.println("\nComo não é nada com o jogador ele vai ao Taverneiro e pergunta se");
               System.out.println("ele sabe onde está a princesa.  Ele diz-lhe que ela está no fundo ");
               System.out.println("da masmorra que se encontra no pantano do Ogre...");

               //sala5
               sala5();

               break;

           default:
               System.out.println("Opção inválida...");
       }
   }

    /**
     * Opção de Ajudar na luta
     * @throws InterruptedException - sleep method
     */
   public static void ajudaBriga() throws InterruptedException {

       Scanner input = new Scanner(System.in);
       int opcao,rest;

       System.out.println("\nQuem ajudar?");
       System.out.println("1- Pequeno Indefeso \t 2-Grandalhão");

       System.out.println("\nOpção: ");
       opcao= input.nextInt();

       switch (opcao){

           case 1:

               //todo: add batalha
               //todo: if vendedor continua senao para o jogo

               System.out.println("Que luta dificil... Mas o Pequeno Indefeso como gratidão oferece duas poções");

               System.out.println("\n Poção Cura adquirida");
               System.out.println("\n Poção Invisibilidade adquirida");

               //todo: add poçoes inventario

               System.out.println("\nQuer descansar?");
               System.out.println("\n1- Não \t 2- Short Rest \t 3- Long Rest");

               System.out.println("\nOpção: ");
               rest=input.nextInt();

               switch (rest){

                   case 1:

                       //todo: sala 5

                       break;

                   case 2:

                       sleep(300);
                       System.out.println("Recuperou 10 de vida!");
                       //todo: add vida
                       sleep(300);


                       //todo: sala 5

                       break;

                   case 3:

                       sleep(500);
                       System.out.println("Recuperou 20 de vida!");
                       //todo: add vida
                       sleep(500);

                       //todo: sala 5
                       break;

                   default:
                       System.out.println("Opção inválida...");
               }

               System.out.println("O Jogador dirige-se  ao Taverneiro e pergunta se ele sabe onde está a princesa.");
               System.out.println("Ele diz-lhe que ela está no fundo da masmorra que se encontra no pantano do Ogre...");

               //sala5
               sala5();

               break;

           case 2:

               System.out.println("Após ajudar o Grandalhão, ele continua chateado e mata o jogador...");
               //todo: add morte
               break;

           default:
               System.out.println("Opção inválida...");
       }

   }

}
