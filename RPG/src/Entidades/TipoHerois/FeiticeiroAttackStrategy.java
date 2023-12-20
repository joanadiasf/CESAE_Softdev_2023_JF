package Entidades.TipoHerois;

import Entidades.NPC;

import java.io.FileNotFoundException;

import static Entidades.TipoHerois.BibliotecaFuncoesComuns.lerFicheiro;
public class FeiticeiroAttackStrategy implements Ataques {

    @Override
    public void ataqueNormal(Herois heroi, NPC adversario) throws FileNotFoundException {
        System.out.println("** PRELIMPIMPIM **");
        adversario.setHP(adversario.getHP() - heroi.getForca());

        lerFicheiro("src/Entidades/TipoHerois/textFiles/magic_attack.txt");
    }

    @Override
    public void ataqueEspecial(Herois heroi,NPC adversario) throws FileNotFoundException {
        System.out.println("** FLECHAS **");
        adversario.setHP(adversario.getHP() - heroi.getForca()+10);

        lerFicheiro("src/Entidades/TipoHerois/textFiles/crossbow_attack.txt");
    }

    @Override
    public void ataqueConsumivel(Herois heroi,NPC adversario) {
        System.out.println("Está a atacar consumivel");
        //todo: add
    }
}
