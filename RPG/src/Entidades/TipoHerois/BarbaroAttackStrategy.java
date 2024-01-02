package Entidades.TipoHerois;

import Entidades.NPC;
import Itens.Consumivel;
import Itens.ConsumivelCombate;
import Itens.Pocao;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Entidades.TipoHerois.BibliotecaFuncoesComuns.lerFicheiro;

public class BarbaroAttackStrategy implements Ataques {
    @Override
    public void ataqueNormal(Herois heroi,NPC adversario) throws FileNotFoundException {
        System.out.println("*** SOCO ***");


        lerFicheiro("src/Entidades/TipoHerois/textFiles/fist_attack.txt");
    }

    @Override
    public void ataqueEspecial(Herois heroi,NPC adversario) throws FileNotFoundException {
        System.out.println("*** MACHADO DE LENHADOR***");

        lerFicheiro("src/Entidades/TipoHerois/textFiles/axe_attack.txt");
    }

    @Override
    public void ataqueConsumivel(Herois heroi,NPC adversario) {
    }

    public String getTipo(){

        return "Barbaro";
    }
}
