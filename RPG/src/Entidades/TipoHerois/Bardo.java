package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.NPC;

public class Bardo extends Herois{

    private static Bardo instance;
    private Bardo(String nome, int forca, Ataques ataques, int ouro) {
        super(nome, forca, ataques, ouro);
    }

    public static Bardo getInstance(String nome, int forca, Ataques ataques, int ouro){


        if (instance == null){
            instance=new Bardo(nome,forca,ataques,ouro);
        }

        return instance;
    }

    @Override
    public void atacarNormal(NPC npc) {
        super.atacarNormal(npc);
        System.out.println("Canção!! CLASSE BARDO");
    }

    @Override
    public void atacarEspecial(NPC npc) {
        super.atacarEspecial(npc);
        System.out.println("Balada Épica!! CLASSE BARBARO");
    }

    @Override
    public void atacarConsumivel(NPC npc) {
        super.atacarConsumivel(npc);
        System.out.println("Gotas prós olhos!! CLASSE BARBARO");
    }
}
