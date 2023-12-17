package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.NPC;

public class Barbaro extends Herois{

    public Barbaro(String nome, int maxHP, int HP, int forca, Ataques ataques, int nivel, int ouro) {
        super(nome, maxHP, HP, forca, ataques, nivel, ouro);
    }

    @Override
    public void atacarNormal(NPC npc) {
        super.atacarNormal(npc);
        System.out.println("Patada na boca!! CLASSE BARBARO");
    }

    @Override
    public void atacarEspecial(NPC npc) {
        super.atacarEspecial(npc);
        System.out.println("Arma!! CLASSE BARBARO");
    }

    @Override
    public void atacarConsumivel(NPC npc) {
        super.atacarConsumivel(npc);
        System.out.println("Bomba de fumo!! CLASSE BARBARO");
    }
}
