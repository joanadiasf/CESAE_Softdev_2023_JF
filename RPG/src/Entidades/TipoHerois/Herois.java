package Entidades.TipoHerois;

import Entidades.Entidade;
import Entidades.NPC;
import Entidades.Tools.CSVLojaReader;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ConsumivelCombate;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static Jogo.SalasJogo.CharacterScreen.morte;
import static Entidades.TipoHerois.BibliotecaFuncoesComuns.lerFicheiro;
public class Herois extends Entidade {

    private int nivel, ouro;
    private Ataques ataques;
    private ArmaPrincipal arma;
    private ArrayList<Consumivel> inventario;


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
        this.inventario = new ArrayList<>();

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
    public ArrayList<Consumivel> getInventario() {
        return inventario;
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
    public void setInventario(ArrayList<Consumivel> inventario) {
        this.inventario = inventario;
    }

    public void setArma(ArmaPrincipal arma) {
        this.arma = arma;
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

    /**
     * Método para usar poção
     * @throws FileNotFoundException - ler files
     */
    public void usarPocao() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        //imprime inventario poçoes
        for (Consumivel consumivelAtual : inventario){

            int i=0;
            if (consumivelAtual instanceof Pocao) {

                Pocao pocaoAtual = (Pocao) consumivelAtual;
                inventario.get(i++);
                pocaoAtual.exibirDetalhes();

                //utilizador seleciona
                System.out.println("Qual a poção que quer?");
                int escolha = input.nextInt();

                if (escolha == i) {

                    //retirar do inventário
                    inventario.remove(i);

                    //incrementa efeitos
                    this.setHP(this.getHP()+pocaoAtual.getEfeitoVida());
                    this.setForca(this.getForca()+pocaoAtual.getAumentoForca());

                }

            }


        }

    }

    public void usarConsumivel(NPC adversario) throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        //imprime inventario consumiveis
        for (Consumivel consumivelAtual : inventario){

            int i=0;
            if (consumivelAtual instanceof ConsumivelCombate) {

                ConsumivelCombate consumivelCombateAtual = (ConsumivelCombate) consumivelAtual;
                inventario.get(i++);
                consumivelCombateAtual.exibirDetalhes();

                //utilizador seleciona
                System.out.println("Qual a poção que quer?");
                int escolha = input.nextInt();

                if (escolha == i) {

                    //retirar do inventário
                    inventario.remove(i);

                    //incrementa efeitos
                    adversario.setHP(adversario.getHP()-consumivelCombateAtual.getAtaqueInstantaneo());

                }

            }


        }

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
                ataqueRoll = random.nextInt(0, 21);

                //se =20 bonus dano
                if (ataqueRoll == 20) {

                    System.out.println(ataqueRoll);
                    System.out.println("Ataque Especial ** DUPLO ** !!!!");
                    ataques.ataqueNormal(this,adversario);

                    adversario.setHP(adversario.getHP() - this.getForca());
                    adversario.setHP(adversario.getHP() - this.getForca());
                    System.out.println("Vida Restante: " + adversario.getHP());
                }
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
                if (ataqueRoll < 8 && ataqueRoll > 2) {

                    System.out.println(ataqueRoll);
                    System.out.println("Falhou...");
                }

                //|| se 1/2 - perde vida

                if (ataqueRoll==1 || ataqueRoll==2){

                    this.setHP(this.getHP()-this.getForca());

                    lerFicheiro("src/Entidades/TipoHerois/textFiles/failed_attack.txt");
                }
                break;

            case 2:

                System.out.println("**** USAR POÇÂO ****");
                usarPocao();
                break;

            case 3:

                System.out.println("**** USAR ITEM COMBATE ****");

                ataques.ataqueConsumivel(this,adversario);
                usarConsumivel(adversario);

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

    /**
     * Batalha final
     * @param adversario - npc
     * @return - vencedor
     * @throws FileNotFoundException - file
     */
    public Entidade batalhaFinal(NPC adversario) throws FileNotFoundException {

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
        } while (adversario.getHP() > 30 || this.getHP() != 0);

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

    public void addInventario(ConsumivelCombate consumivelAtual){

        inventario.add(consumivelAtual);
    }

    public void removeInventario (ConsumivelCombate consumivelAtual){

        inventario.remove(consumivelAtual);
    }
    public void addInventario(Pocao pocaoAtual){

        inventario.add(pocaoAtual);
    }

    public void removeInventario (Pocao pocaoAtual){

        inventario.remove(pocaoAtual);
    }
}
