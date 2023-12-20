package Entidades.TipoHerois;

import Entidades.NPC;
import Entidades.TipoHerois.Herois;

import java.io.FileNotFoundException;

public interface Ataques {

    void ataqueNormal(Herois heroi, NPC Inimigo) throws FileNotFoundException;
    void ataqueEspecial(Herois heroi,NPC Inimigo) throws FileNotFoundException;
    void ataqueConsumivel(Herois heroi,NPC Inimigo);
}
