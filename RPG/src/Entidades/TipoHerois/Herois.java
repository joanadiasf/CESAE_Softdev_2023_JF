package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.Entidade;
import Entidades.NPC;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Herois extends Entidade {

    private int nivel,ouro;
    private Ataques ataques;

    //armaPrincipal(ArmaPrincipal) - objeto
    //ArrayList <Consumivel> - inventario

//depois add o que falta


    public Herois(String nome, int forca, Ataques ataques, int ouro) {
        super(nome, forca, ataques);
        this.nivel = 1;
        this.ouro = ouro;

    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public Ataques getAtaques() {
        return ataques;
    }

    @Override
    public void exibirDetalhes() {

    }

    public void setAtaques(Ataques ataques) {
        this.ataques = ataques;
    }

    public void atacarNormal(NPC npc){

        System.out.println("Está a atacar normal (mensagem a remover??) CLASSE HEROIS");

        ataques.ataqueNormal();
    }

    public void atacarEspecial(NPC npc){

        System.out.println("Está a atacar especial (mensagem a remover??)  CLASSE HEROIS");
        ataques.ataqueEspecial();
    }

    public void atacarConsumivel(NPC npc){

        System.out.println("Está a atacar consumivel (mensagem a remover??)  CLASSE HEROIS");
        ataques.ataqueConsumivel();
    }

    public void usarPocao() throws FileNotFoundException {

        //imprime inventario poçoes
        Pocao.exibirDetalhes();

        //utilizador seleciona

        //incrementa efeitos


        System.out.println("A usar poção... (mensagem a remover ???)  CLASSE HEROIS");
    }

    public Entidade batalha(NPC npc) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int iniciativa,ataqueRoll,opcao;

        Random random = new Random();

        System.out.println("Rolar D20 para iniciativa...");
        iniciativa= random.nextInt(1,20);

        //se iniciativa > 10 e >20 - ataque
        if (iniciativa >10 && iniciativa <20){

            atacarNormal();
        }

        //se iniciativa =20 - ataque especial
        if (iniciativa==20){
            atacarEspecial();
        }

        //se iniciativa < 10 - NPC ataca primeiro


        //ciclo de ataques
        // ciclo 1 começa npc || ciclo 2 começa heroi
        do {

            if (iniciativa >10){

                //npc ataca

                //jogador ataca
                
                //no turno do heroi pergunta se quer atacar ou usar item
                System.out.println("\n1- Atacar \t 2- Usar Poção \t 3- Usar Item Combate");
                System.out.println("\nOpção: ");
                opcao= input.nextInt();

                switch (opcao){

                    case 1:

                        System.out.println("Rolar D20 para Poder de Ataque....");
                        ataqueRoll= random.nextInt(1,20);

                        //se =20 bonus dano ??

                        //se >17 ataque especial
                        if (ataqueRoll > 17){

                            System.out.println(ataqueRoll);
                            System.out.println("Ataque Especial!!");
                            atacarEspecial();
                        }

                        // || se >8 e <17 ataque normal
                        if (ataqueRoll > 8 && ataqueRoll < 17){

                            System.out.println(ataqueRoll);
                            System.out.println("Ataque Normal!!");
                            atacarNormal();
                        }

                        // || se <8 falha
                        if (ataqueRoll < 8 && ataqueRoll > 1){

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
                        //todo: add
                        break;

                    default:
                        System.out.println("Opção inválida...");
                }
            }

            if (iniciativa <10){

                //no turno do heroi pergunta se quer atacar ou usar item
                System.out.println("\n1- Atacar \t 2- Usar Poção \t 3- Usar Item Combate");
                System.out.println("\nOpção: ");
                opcao= input.nextInt();

                switch (opcao){

                    case 1:

                        System.out.println("Rolar D20 para Poder de Ataque....");
                        ataqueRoll= random.nextInt(1,20);

                        //se =20 bonus dano ??

                        //se >17 ataque especial
                        if (ataqueRoll > 17){

                            System.out.println(ataqueRoll);
                            System.out.println("Ataque Especial!!");
                            atacarEspecial();
                        }

                        // || se >8 e <17 ataque normal
                        if (ataqueRoll > 8 && ataqueRoll < 17){

                            System.out.println(ataqueRoll);
                            System.out.println("Ataque Normal!!");
                            atacarNormal();
                        }

                        // || se <8 falha
                        if (ataqueRoll < 8 && ataqueRoll > 1){

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
                        //todo: add
                        break;

                    default:
                        System.out.println("Opção inválida...");
                }

            }

        }while (Entidade.getHP !=0);






        //o primeiro a perder a vida toda morre
        //se heroi perder - game over screen

        return null;
    }
}
