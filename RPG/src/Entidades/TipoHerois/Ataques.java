package Entidades.TipoHerois;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;

public interface Ataques {

    void ataqueNormal(Herois heroi, NPC Inimigo);
    void ataqueEspecial(Herois heroi,NPC Inimigo);
    void ataqueConsumivel(Herois heroi,NPC Inimigo);
}
