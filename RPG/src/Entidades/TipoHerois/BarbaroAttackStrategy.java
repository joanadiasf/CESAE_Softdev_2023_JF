package Entidades.TipoHerois;

import Entidades.NPC;
import Itens.Consumivel;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Entidades.TipoHerois.BibliotecaFuncoesComuns.lerFicheiro;

public class BarbaroAttackStrategy implements Ataques {
    @Override
    public void ataqueNormal(Herois heroi,NPC adversario) throws FileNotFoundException {
        System.out.println("*** SOCO ***");
        adversario.setHP(adversario.getHP() - heroi.getForca());

        lerFicheiro("src/Entidades/TipoHerois/textFiles/fist_attack.txt");
    }

    @Override
    public void ataqueEspecial(Herois heroi,NPC adversario) throws FileNotFoundException {
        System.out.println("*** MACHADO DE LENHADOR***");
        adversario.setHP(adversario.getHP() - heroi.getForca()+45);

        lerFicheiro("src/Entidades/TipoHerois/textFiles/axe_attack.txt");
    }

    @Override
    public void ataqueConsumivel(Herois heroi,NPC adversario) {


        System.out.println("Está a atacar consumivel");
        //todo: add
    }
}
