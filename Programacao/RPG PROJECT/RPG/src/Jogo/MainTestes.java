package Jogo;
import Entidades.NPC;
import Entidades.TipoHerois.FeiticeiroAttackStrategy;
import Entidades.TipoHerois.Herois;
import Entidades.Vendedor;
import Jogo.SalasJogo.Sala1_Taberna1;

import java.io.FileNotFoundException;

public class MainTestes {



    public static void main(String[] args) throws InterruptedException, FileNotFoundException {



        Herois heroi = new Herois("Hero",100,10,1,100, new FeiticeiroAttackStrategy());
//
//        NPC npc = new NPC("Ogre",50,5,20);
//
//
//          //testar historia toda
//        Sala1_Taberna1.sala1_Inicio(heroi);
//
//        //testar só batalha
//        heroi.batalha(npc);


        Vendedor vendedor = new Vendedor();

        vendedor.lojaVendedor(heroi);
    }
}
