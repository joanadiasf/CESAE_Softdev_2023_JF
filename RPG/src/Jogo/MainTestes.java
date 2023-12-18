package Jogo;
import Entidades.Ataques;
import Entidades.NPC;
import Entidades.TipoHerois.BardoAttackStrategy;
import Entidades.TipoHerois.FeiticeiroAttackStrategy;
import Entidades.TipoHerois.Herois;

import java.io.FileNotFoundException;

public class MainTestes {



    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        //testar historia toda
        //Sala1_Taberna1.sala1_Inicio();

        Herois heroi = new Herois("Hero",100,10,1,100, new FeiticeiroAttackStrategy());

        NPC npc = new NPC("Ogre",50,5,20);


        heroi.batalha(npc);

    }
}
