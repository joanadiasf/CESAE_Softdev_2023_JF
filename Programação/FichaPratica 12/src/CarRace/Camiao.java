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
    public void viagem(double distancia, double carga, Camiao camiaoViagem){

        double custo=0;
        if (carga < capacidadeCargaKg){

            if (distancia > 100){

                custo=camiaoViagem.litros(distancia)*1.95;
            }
            else{
                
                custo=((camiaoViagem.getLitros100Km()+0.1)*camiaoViagem.litros(distancia)) *1.95;
            }


        }
        else {
            System.out.println("ULTRAPASSA A CARGA MÁXIMA!!! VIAGEM RECUSADA...");
        }
    }
}
