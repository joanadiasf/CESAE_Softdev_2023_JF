package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.Entidade;
import Entidades.NPC;

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

    public void usarPocao(){

        //imprime inventario poçoes
        //utilizador seleciona
        //incrementa efeitos
        System.out.println("A usar poção... (mensagem a remover ???)  CLASSE HEROIS");
    }

    public Herois batalha(NPC npc){

        //ver metodo corridas

        Herois heroi = null;
        System.out.println("LUTAAAAAAAAAA!!!!!");

        return heroi;
    }
}
