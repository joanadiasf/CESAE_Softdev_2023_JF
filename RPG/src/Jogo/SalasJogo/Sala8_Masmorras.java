package Jogo.SalasJogo;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.CharacterScreen.*;
import static java.lang.Thread.sleep;


public class Sala8_Masmorras {

    /**
     * Sala 8
     */
    public static void sala8(Herois heroi) throws FileNotFoundException, InterruptedException {

        System.out.println("\n * * * * * * * *");
        System.out.println("* C A S T E L O *");
        System.out.println(" * * * * * * * *");

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\nO fim aproxima-se....");
        sleep(800);
        System.out.println("Jogador faça as escolhas certas...(Sem pressão)");

        System.out.println("\n1- Masmorras \t 2- Sala do Rei");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                masmorras(heroi);
                break;

            case 2:

                salaRei(heroi);
                break;

            default:
                System.out.println("Opção inválida...");
        }


    }

    /**
     * Escolha SALA DO REI
     */
    public static void salaRei(Herois heroi) throws FileNotFoundException {

        System.out.println("\n * * * * * * * * * * *");
        System.out.println("* S A L A  D O  R E I *");
        System.out.println(" * * * * * * * * * * *");

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\nUm grande tesouro encontra-se atrás do trono... Terá dono?");
        System.out.println("\n1- Roubar tesouro \t 2- Não roubar");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("\nDentro do Tesouro sai um vulto que engole o Jogador ainda vivo...");

                morte();

                break;

            case 2:

                System.out.println("\nO Jogador contém-se, sai da sala e dirige-se para as Masmorras.");
                masmorras(heroi);
                break;

            default:
                System.out.println("Opção inválida...");
        }

    }

    /**
     * Escolha MASMORRAS
     */
    public static void masmorras(Herois heroi) throws FileNotFoundException {

        System.out.println("\n * * * * * * * * * *");
        System.out.println("* M A S M O R R A S *");
        System.out.println(" * * * * * * * * * *");

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\nA princesa está amarrada a uma cadeira... O Jogador corre para a salvar ");
        System.out.println("mas um Ogre Gigante (parecido com um macaco) põe-se no caminho...");

        tobias();

        NPC tobias = new NPC("Tobias O Grande",100,25,40);

        //batalha final *****************
        heroi.batalhaFinal(tobias);

        System.out.println("\nO inimigo está quase a morrer...");
        System.out.println("\n1- Poupar-lhe a vida \t 2- Acabar com ele");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("\nO Ogre ajoelha-se... ** “Obrigada... obrigada por me poupar a vida... Só fiz isto porque");
                System.out.println(" precisava do dinheiro da recompensa para salvar a minha família da fome...” **");
                System.out.println("\nO jogador retorna à sua cidade com a princesa e o Ogre...");
                System.out.println("É aclamado como Salvador da Vila.");
                System.out.println("\nContinua pobre... mas ao menos agora tem trabalho");
                System.out.println("como mercenário com o seu sidequick Ogre.");

                break;

            case 2:

                System.out.println("\nO jogador retorna à sua cidade com a princesa ... ");
                System.out.println(" É aclamado como Salvador da Vila.");
                System.out.println("\nMas a que custo?... Continua pobre... e sozinho... mas ao menos");
                System.out.println(" agora tem trabalho a limpar as mesas da taverna.");
                break;

            default:
                System.out.println("Opçção inválida...");
        }

    }
}
