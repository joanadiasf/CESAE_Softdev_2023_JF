import Enums.*;

import java.io.FileNotFoundException;

import static Lib.Biblioteca.imprimirFicheiro;

public class Mota extends Veiculo {

    //Construtor
    public Mota(String marca, String modelo, int idade, int potencia, double cilindrada, TipoCombustivel combustivel, int litros100Km) {
        super(marca, modelo, idade, potencia, cilindrada, combustivel, litros100Km);
    }

    public void imprimirMota() throws FileNotFoundException {

        imprimirFicheiro("src/Mota.txt");
    }
}
