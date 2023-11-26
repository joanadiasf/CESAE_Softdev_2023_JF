package CarRace;

import CarRace.Enums.TipoCombustivel;

public class Camiao  extends Veiculo{

    private double capacidadeCargaKg;

    // Construtor
    public Camiao(String marca, String modelo, int idade, int potencia, double cilindrada, TipoCombustivel combustivel, int litros100Km, double capacidadeCargaKg) {
        super(marca, modelo, idade, potencia, cilindrada, combustivel, litros100Km);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    //void?
}
