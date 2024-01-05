package Entidades.TipoHerois;

import Entidades.Entidade;
import Entidades.NPC;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ConsumivelCombate;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static Jogo.Jogo.personagem;
import static Jogo.SalasJogo.CharacterScreen.morte;
import static Entidades.TipoHerois.BibliotecaFuncoesComuns.lerFicheiro;
import static Jogo.SalasJogo.Sala1_Taberna1.sala1_Inicio;

public class Herois extends Entidade {

    private int nivel, ouro;
    private Ataques ataques;
    private ArmaPrincipal arma;
    private ArrayList<Consumivel> inventario;


    /**
     * Construtor
     *
     * @param nome    Nome Personagem
     * @param HP      Vida
     * @param forca   Força
     * @param nivel   Nivel
     * @param ouro    Dinheiro
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
     *
     * @throws FileNotFoundException - ler files
     */
    public void usarPocao() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int removerPocao = -1; //nao pode ser a 0 porque senao tira o item do indice 0
        //imprime inventario poçoes
        for (Consumivel consumivelAtual : inventario) {

            int i = -1;
            if (consumivelAtual instanceof Pocao) {

                Pocao pocaoAtual = (Pocao) consumivelAtual;
                inventario.get(++i);
                System.out.println("\nItem " + i + ": ");

                pocaoAtual.exibirDetalhes();

                //utilizador seleciona
                System.out.println("Qual a Poção que quer?");
                int escolha = input.nextInt();
                System.out.println(escolha);
                if (i == escolha) {

                    //retirar do inventário
                    removerPocao=i;

                    //incrementa efeitos
                    this.setHP(this.getHP() + pocaoAtual.getEfeitoVida());
                    System.out.println("** Ganhou " + pocaoAtual.getEfeitoVida() + " de Vida");

                    this.setForca(this.getForca() + pocaoAtual.getAumentoForca());
                    System.out.println("e " + pocaoAtual.getAumentoForca() + " de Força! **");
                }

            }
            //retirar do inventario
            inventario.remove(removerPocao);
        }



    }

    /**
     * Método para usar Consumivel
     *
     * @param adversario - npc
     * @throws FileNotFoundException - file
     */
    public void usarConsumivel(NPC adversario) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int removerConsumivel = -1; //nao pode ser a 0 porque senao tira o item do indice 0

        //imprime inventario consumiveis
        for (Consumivel consumivelAtual : inventario) {

            int i = 0;
            if (consumivelAtual instanceof ConsumivelCombate) {

                ConsumivelCombate consumivelCombateAtual = (ConsumivelCombate) consumivelAtual;

                inventario.get(++i);
                System.out.println("\nItem " + i + ": ");

                consumivelCombateAtual.exibirDetalhes();


                //utilizador seleciona
                System.out.println("Qual o Consumivel que quer?");
                int escolha = input.nextInt();

                if (i == escolha) {

                    //retirar do inventário
                    removerConsumivel=i;

                    //incrementa efeitos
                    adversario.setHP(adversario.getHP() - consumivelCombateAtual.getAtaqueInstantaneo());

                    System.out.println("** Ataque Instantaneo de " + consumivelCombateAtual.getAtaqueInstantaneo() + " **");

                }

            }

            //remover
            inventario.remove(removerConsumivel);
        }

    }

    /**
     * Método de ataque do Jogador
     *
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
                    ataques.ataqueNormal(this, adversario);

                    adversario.setHP(adversario.getHP() - (this.getForca() - 10));
                    adversario.setHP(adversario.getHP() - (this.getForca() - 10));
                    System.out.println("Vida Restante Adversário: " + adversario.getHP());
                }
                //se >17 ataque especial
                if (ataqueRoll >= 17) {

                    System.out.println(ataqueRoll);
                    System.out.println("Ataque Especial!!");
                    ataques.ataqueNormal(this, adversario);


                    adversario.setHP(adversario.getHP() - (this.getForca() - 10));
                    System.out.println("Vida Restante Adversário: " + adversario.getHP());
                }

                // || se >5 e <17 ataque normal
                if (ataqueRoll >= 5 && ataqueRoll < 17) {

                    System.out.println(ataqueRoll);
                    System.out.println("Ataque Normal!!");
                    ataques.ataqueEspecial(this, adversario);

                    adversario.setHP(adversario.getHP() - this.getForca());
                    System.out.println("Vida Restante Adversário: " + adversario.getHP());
                }

                // || se <5 falha
                if (ataqueRoll < 5 && ataqueRoll > 2) {

                    System.out.println(ataqueRoll);
                    System.out.println("Falhou...");
                }

                //|| se 1/2 - perde vida

                if (ataqueRoll == 1 || ataqueRoll == 2) {

                    this.setHP(this.getHP() - this.getForca());

                    lerFicheiro("src/Entidades/TipoHerois/textFiles/failed_attack.txt");
                    System.out.println("\nVida Restante Jogador: " + this.getHP());
                }
                break;

            case 2:

                System.out.println("**** USAR POÇÂO ****");
                usarPocao();
                break;

            case 3:

                System.out.println("**** USAR ITEM COMBATE ****");

//                ataques.ataqueConsumivel(this,adversario);
                usarConsumivel(adversario);

                break;

            default:
                System.out.println("Opção inválida...");
        }
    }

    /**
     * Método de ataque do NPC
     *
     * @param adversario - NPC
     */
    public void npcAtaca(NPC adversario) {

        int ataqueRoll;

        Random random = new Random();
        System.out.println("Adversário ataca");

        ataqueRoll = random.nextInt(1, 3);

        if (ataqueRoll == 1) {

            //ataque normal


            //tira vida jogador
            this.setHP(this.getHP() - adversario.getForca());
            System.out.println("Vida Restante Jogador: " + this.getHP());

        }
        if (ataqueRoll == 2) {

            //ataque especial


            //tira vida jogador
            this.setHP(this.getHP() - (adversario.getForca() - 10));
            System.out.println("Vida Restante Jogador: " + this.getHP());
        }


    }

    /**
     * Batalha
     * @param adversario - NPC
     * @return - vencedor
     * @throws FileNotFoundException - porque chama o método usarPocao()
     */
    public Entidade batalha(NPC adversario) throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int iniciativa, ataqueRoll, opcao;

        Random random = new Random();

        System.out.println("\nRolar D20 para iniciativa...");
        iniciativa = random.nextInt(1, 21);
        System.out.println(iniciativa);


        lerFicheiro("src/Entidades/battleScreen.txt");

        if (iniciativa < 10) {
            npcAtaca(adversario);
        }

        //ciclo de ataques

        do {

            jogadorAtaca(adversario);
            npcAtaca(adversario);


            if (adversario.getHP() <= 0 || this.getHP() <= 0) {

                if (adversario.getHP() <= 0) {

                    System.out.println("\n**RECOMPENSA " + adversario.getOuro() + " ouro **");
                    this.setOuro(this.getOuro() + adversario.getOuro());

                    System.out.println("\n *** SUBIU DE NIVEL ***");
                    this.setNivel(this.getNivel() + 1);

                    if (this.getHP() < this.getMaxHP()) {
                        System.out.println("*** VIDA + 15 ***");
                        this.setHP(this.getHP() + 15);
                    }


                    return this;
                }
                if (this.getHP() <= 0) {
                    morte();

                    System.out.println("\n\nQueres voltar a tentar?");
                    System.out.println("1- Sim \t 2- Não");
                    int escolha=input.nextInt();

                    switch (escolha){

                        case 1:
                            sala1_Inicio(personagem());
                            break;

                        case 2:
                            System.out.println("Adeus...");


                        default:
                            System.out.println("Opção inválida...");
                    }

                    return adversario;
                }
                return null;
            }

        } while (true);


    }

    /**
     * Batalha final
     *
     * @param adversario - npc
     * @return - vencedor
     * @throws FileNotFoundException - file
     */
    public Entidade batalhaFinal(NPC adversario) throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int iniciativa, ataqueRoll, opcao;

        Random random = new Random();

        System.out.println("\nRolar D20 para iniciativa...");
        iniciativa = random.nextInt(1, 21);
        System.out.println(iniciativa);

        if (iniciativa < 10) {
            npcAtaca(adversario);
        }

        //ciclo de ataques

        do {

            jogadorAtaca(adversario);
            npcAtaca(adversario);


            if (adversario.getHP() <= 30 || this.getHP() <= 0) {


                if (this.getHP() <= 0) {

                        morte();

                        System.out.println("\n\nQueres voltar a tentar?");
                        System.out.println("1- Sim \t 2- Não");
                        int escolha=input.nextInt();

                        switch (escolha){

                            case 1:
                                sala1_Inicio(personagem());
                                break;

                            case 2:
                                System.out.println("Adeus...");


                            default:
                                System.out.println("Opção inválida...");
                        }

                        return adversario;


                }
                return this;
            }

        } while (true);
    }

    //****************************************************************** INVENTARIO

    /**
     * Método para adicionar consumivel de combate ao inventario
     * @param consumivelAtual - o que recebe
     */
    public void addInventario(ConsumivelCombate consumivelAtual) {

        inventario.add(consumivelAtual);
    }

    /**
     * Método para adicionar poções ao inventario
     * @param pocaoAtual - o que recebe
     */
    public void addInventario(Pocao pocaoAtual) {

        inventario.add(pocaoAtual);
    }

}
