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
       int opcao1,opcao2,pocao;

       sleep(500);

       System.out.println("\nApós um longo caminho " + heroi.getNome() + " decide parar numa Taverna que encontra pelo caminho...");

       System.out.println("\n * * * * * * *");
       System.out.println("* T A V E R N A *");
       System.out.println(" * * * * * * * *");


       System.out.println("\n1- Comprar Poções \t 2- Não comprar nada");
       pocao= input.nextInt();

       if (pocao==1){

           //opções de poções
           System.out.println("1- Poção Vitamina C (20 ouros) \t 2- Poção God of War (40 ouros) \t 3- Poção Força Divina (60 ouros)");
            int escolhaPocao= input.nextInt();

           //retirar dinheiro
           if (escolhaPocao==1){
               System.out.println("** POÇÃO VITAMINA C adicionada ao inventário");
               heroi.addInventario(new Pocao("Pocao Vitamina C",0,new String[]{"Feiticeiro","Bardo","Barbaro"},40,0));
               heroi.setOuro(heroi.getOuro()-20);
           }
           if (escolhaPocao==2){
               System.out.println("** POÇÃO GOD OF WAR adicionada ao inventário");
               heroi.addInventario(new Pocao("Pocao God of War",0,new String[]{"Feiticeiro","Bardo","Barbaro"},30,25));
               heroi.setOuro(heroi.getOuro()-40);
           }
           if(escolhaPocao==3){
               System.out.println("** POÇÃO FORÇA DIVINA adicionada ao inventário");
               heroi.addInventario(new Pocao("Pocao Força Divina",0,new String[]{"Feiticeiro","Bardo","Barbaro"},-10,40));
               heroi.setOuro(heroi.getOuro()-60);
           }

           System.out.println("\nApós comprar comida " + heroi.getNome() + " ouve uma discussão acessa entre dois clientes...");
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

               System.out.println("\nComo não é nada consigo, " + heroi.getNome() + " vai ao Taverneiro e pergunta se");
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

               System.out.println("Grandalhão appears!!");

               if (heroi.getHP() > 0){
                   heroi.batalha(grandalhao);
               } else{
                   return;
               }

               System.out.println("Que luta dificil... Mas o Pequeno Indefeso como gratidão oferece duas poções");

               System.out.println("\n Poção Cura adquirida");
               System.out.println("\n Poção Invisibilidade adquirida");

               //add poçoes inventario
               heroi.addInventario(new Pocao("Pocao Cura",0,new String[]{"Feiticeiro","Bardo","Barbaro"},35,0));
               heroi.addInventario(new Pocao("Pocao Invisibilidade",0,new String[]{"Feiticeiro","Bardo","Barbaro"},0,15));


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
               sleep(500);
               System.out.println( heroi.getNome() + " dirige-se  ao Taverneiro e pergunta se ele sabe onde está a princesa.");
               System.out.println("Ele diz-lhe que ela está no fundo da masmorra que se encontra no pantano do Ogre...");

               //sala5
               sala5(heroi);

               break;

           case 2:
               sleep(500);
               System.out.println("Após ajudar o Grandalhão, ele continua chateado e mata " + heroi.getNome() + "...");

               morte();
               break;

           default:
               System.out.println("Opção inválida...");
       }

   }

}
