package Entidades.TipoHerois;

import Entidades.Ataques;
import Entidades.NPC;

public class BarbaroAttackStrategy implements Ataques {
    @Override
    public void ataqueNormal(Herois heroi,NPC adversario) {
        System.out.println("Está a atacar normal");
        adversario.setHP(adversario.getHP() - heroi.getForca());
    }

    @Override
    public void ataqueEspecial(Herois heroi,NPC adversario) {
        System.out.println("Está a atacar especial");
    }

    @Override
    public void ataqueConsumivel(Herois heroi,NPC adversario) {
        System.out.println("Está a atacar consumivel");
    }
}
