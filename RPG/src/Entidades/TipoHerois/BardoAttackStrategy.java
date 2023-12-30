package Entidades.TipoHerois;

import Entidades.NPC;

import java.io.FileNotFoundException;

import static Entidades.TipoHerois.BibliotecaFuncoesComuns.lerFicheiro;
public class BardoAttackStrategy implements Ataques {

    @Override
    public void ataqueNormal(Herois heroi, NPC adversario) throws FileNotFoundException {
        System.out.println("** MELODIAS DE DOR **");
        //adversario.setHP(adversario.getHP() - heroi.getForca());

        lerFicheiro("src/Entidades/TipoHerois/textFiles/music_attack.txt");
    }

    @Override
    public void ataqueEspecial(Herois heroi,NPC adversario) throws FileNotFoundException {
        System.out.println("** DARDOS **");
       // adversario.setHP(adversario.getHP() - heroi.getForca()+10);

        lerFicheiro("src/Entidades/TipoHerois/textFiles/dart_attack.txt");
    }

    @Override
    public void ataqueConsumivel(Herois heroi,NPC adversario) {
        System.out.println("Está a atacar consumivel");
        //todo: add
    }
}
