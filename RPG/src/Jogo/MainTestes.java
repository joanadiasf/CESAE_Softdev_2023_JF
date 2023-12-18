package Jogo;
import Entidades.NPC;

import java.io.FileNotFoundException;

public class MainTestes {

    private static Entidades.Ataques Ataques;

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        //testar historia toda
        //Sala1_Taberna1.sala1_Inicio();

        Feiticeiro wizard = Feiticeiro.getInstance("Merlin",10, Ataques,100);
        NPC npc = new NPC("Ogre",5,Ataques,10);



        wizard.batalha(npc);
    }
}
