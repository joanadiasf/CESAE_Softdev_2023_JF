package Jogo.SalasJogo;

import java.util.Scanner;

public class Sala8_Masmorras {

    /**
     * Sala 8
     */
    public static void sala8(){

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\nO fim aproxima-se.... Jogador faça as escolhas certas...(Sem pressão)");

        System.out.println("\n1- Masmorras \t 2- Sala do Rei");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                masmorras();
                break;

            case 2:

                salaRei();
                break;

            default:
                System.out.println("Opção inválida...");
        }


    }

    /**
     * Escolha SALA DO REI
     */
    public static void salaRei(){

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\nUm grande tesouro encontra-se atrás do trono... Terá dono?");
        System.out.println("\n1- Roubar tesouro \t 2- Não roubar");

        System.out.println("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:

                System.out.println("\nDentro do Tesouro sai um vulto que engole o Jogador ainda vivo...");

                //todo: add morte
                break;

            case 2:

                System.out.println("\nO Jogador contém-se, sai da sala e dirige-se para as Masmorras.");
                masmorras();
                break;

            default:
                System.out.println("Opção inválida...");
        }

    }

    /**
     * Escolha MASMORRAS
     */
    public static void masmorras(){

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\nA princesa está amarrada a uma cadeira... O Jogador corre para a salvar ");
        System.out.println("mas um Ogre Gigante põe-se no caminho...");

        //todo: add batalha final

        //todo: if vendedor continua senao para o jogo

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
