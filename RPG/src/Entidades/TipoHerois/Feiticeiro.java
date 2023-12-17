package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.NPC;

public class Feiticeiro extends Herois{

    public Feiticeiro(String nome, int maxHP, int HP, int forca, Ataques ataques, int nivel, int ouro) {
        super(nome, maxHP, HP, forca, ataques, nivel, ouro);
    }

    @Override
    public void atacarNormal(NPC npc) {
        super.atacarNormal(npc);

        System.out.println("Dardo!! CLASSE FEITICEIRO");

    }

    @Override
    public void atacarEspecial(NPC npc) {
        super.atacarEspecial(npc);
        System.out.println("Anel de fogo!! CLASSE FEITICEIRO");
    }

    @Override
    public void atacarConsumivel(NPC npc) {
        super.atacarConsumivel(npc);
        System.out.println("Bomba de mau cheiro!! CLASSE FEITICEIRO");
    }
}
