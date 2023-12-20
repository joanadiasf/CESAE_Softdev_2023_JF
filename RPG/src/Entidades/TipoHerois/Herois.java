package Entidades.TipoHerois;

import Entidades.Entidade;
import Entidades.NPC;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static Jogo.SalasJogo.Morte.morte;

public class Herois extends Entidade {

    private int nivel, ouro;
    private Ataques ataques;

    //todo-------------------------------
    private ArmaPrincipal arma;
    private ArrayList<Consumivel> inventarioConsumivelAtaque;
    private ArrayList<Pocao> inventarioPocao;


    /**
     * Construtor
     * @param nome Nome Personagem
     * @param HP Vida
     * @param forca Força
     * @param nivel Nivel
     * @param ouro Dinheiro
     * @param ataques Ataques
     */
    public Herois(String nome, int HP, int forca, int nivel, int ouro, Ataques ataques) {
        super(nome, HP, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.ataques = ataques;
        this.arma = null;
        this.inventarioConsumivelAtaque = new ArrayList<>();
        this.inventarioPocao = new ArrayList<>();
    }

    //*************************************************************** GETTERs
    public int getNivel() {
        return nivel;
    }
    public int getOuro() {
        return ouro;
    }
    public Ataques getAtaques() {
        return ataques;
    }

    //*************************************************************** SETTERs
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setOuro(int ouro) {
        this.ouro = ouro;
    }
    public void setAtaques(Ataques ataques) {
        this.ataques = ataques;
    }

    //*************************************************************** MÉTODOS
    @Override
    public void exibirDetalhes() {

        System.out.println("Nome: " + this.getNome());
        System.out.println("Vida: " + this.getHP());
        System.out.println("Força de Ataque: " + this.getForca());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("Dinheiro: " + this.getOuro());

    }

    //todo ______________________
    public void usarPocao() throws FileNotFoundException {

        //imprime inventario poçoes

        //Pocao.exibirDetalhes();

        //utilizador seleciona

        //incrementa efeitos


        System.out.println("A usar poção... (mensagem a remover ???)  CLASSE HEROIS");
    }

    /**
     * Método de ataque do Jogador
     * @param adversario npc
     * @throws FileNotFoundException - porque chama o método usarPocao()
     */
    public void jogadorAtaca(NPC adversario) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int ataqueRoll, opcao;

        Random random = new Random();

        //jogador ataca

        //no turno do heroi pergunta se quer atacar ou usar item
        System.out.println("\n1- Atacar \t 2- Usar Poção \t 3- Usar Item Combate");
        System.out.println("\nOpção: ");
        opcao = input.nextInt();

        switch (opcao) {

            case 1:

                System.out.println("Rolar D20 para Poder de Ataque....");
                ataqueRoll = random.nextInt(1, 21);

                //se =20 bonus dano ??

                //se >17 ataque especial
                if (ataqueRoll >= 17) {

                    System.out.println(ataqueRoll);
                    System.out.println("Ataque Especial!!");
                    ataques.ataqueNormal(this,adversario);


                    adversario.setHP(adversario.getHP() - this.getForca());
                    System.out.println("Vida Restante: " + adversario.getHP());
                }

                // || se >8 e <17 ataque normal
                if (ataqueRoll >= 8 && ataqueRoll < 17) {

                    System.out.println(ataqueRoll);
                    System.out.println("Ataque Normal!!");
                    ataques.ataqueEspecial(this,adversario);

                    adversario.setHP(adversario.getHP() - this.getForca());
                    System.out.println("Vida Restante: " + adversario.getHP());
                }

                // || se <8 falha
                if (ataqueRoll < 8) {

                    System.out.println(ataqueRoll);
                    System.out.println("Falhou...");
                }

                //|| se 1/2 - perde vida??
                break;

            case 2:

                System.out.println("**** USAR POÇÂO ****");
                usarPocao();
                break;

            case 3:

                System.out.println("**** USAR ITEM COMBATE ****");

                ataques.ataqueConsumivel(this,adversario); //???
                //todo: add
                break;

            default:
                System.out.println("Opção inválida...");
        }
    }

    /**
     * Método de ataque do NPC
     * @param adversario - NPC
     */
    public void npcAtaca(NPC adversario) {

        int  ataqueRoll;

        Random random = new Random();
        System.out.println("Adversário ataca");

        ataqueRoll = random.nextInt(1, 3);

        if (ataqueRoll == 1) {

            //ataque normal


            //tira vida jogador
            this.setHP(this.getHP() - adversario.getForca());
            System.out.println("Vida Restante: " + this.getHP());

        }
        if (ataqueRoll == 2) {

            //ataque especial


            //tira vida jogador
            this.setHP(this.getHP() - adversario.getForca());
            System.out.println("Vida Restante: " + this.getHP() + 10);
        }


    }

    /**
     * Batalha
     * @param adversario - NPC
     * @return - vencedor
     * @throws FileNotFoundException - porque chama o método usarPocao()
     */
    public Entidade batalha(NPC adversario) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int iniciativa, ataqueRoll, opcao;

        Random random = new Random();

        System.out.println("\nRolar D20 para iniciativa...");
        iniciativa = random.nextInt(1, 21);
        System.out.println(iniciativa);

        if(iniciativa<10){
            npcAtaca(adversario);
        }

        //ciclo de ataques

        do {

            jogadorAtaca(adversario);
            npcAtaca(adversario);

            //o primeiro a perder a vida toda morre
        } while (adversario.getHP() != 0 || this.getHP() != 0);

        if (adversario.getHP() != 0) {

            this.setOuro(this.getOuro()+adversario.getOuro());

            return this;
        }

        if (this.getHP() != 0) {
            morte();
            return adversario;

        }
        return null;
    }


}
