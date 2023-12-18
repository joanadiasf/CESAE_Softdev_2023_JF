package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.NPC;

public class Barbaro extends Herois{

    private static Barbaro instance;

    private Barbaro(String nome, int forca, Ataques ataques, int ouro) {
        super(nome, forca, ataques, ouro);
    }

    public static Barbaro getInstance(String nome, int forca, Ataques ataques, int ouro){


        if (instance == null){
            instance=new Barbaro(nome,forca,ataques,ouro);
        }

        return instance;
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
