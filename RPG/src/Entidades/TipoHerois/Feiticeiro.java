package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.NPC;

public class Feiticeiro extends Herois{

    private static Feiticeiro instance;

    private Feiticeiro(String nome, int forca, Ataques ataques, int ouro) {
        super(nome, forca, ataques, ouro);
    }

    public static Feiticeiro getInstance(String nome, int forca, Ataques ataques, int ouro){


        if (instance == null){
            instance=new Feiticeiro(nome,forca,ataques,ouro);
        }

        return instance;
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
