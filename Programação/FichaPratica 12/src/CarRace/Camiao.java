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
    public void viagem(double distancia, double carga){

        double custo=0;
        if (carga <= capacidadeCargaKg){

            if (distancia > 100){

                custo=this.litros(distancia)*1.95;
            }
            else{

                custo=((this.getLitros100Km()+0.1)*this.litros(distancia)) *1.95;
            }

            System.out.println("VIAGEM ACEITE");
        }
        else {
            System.out.println("ULTRAPASSA A CARGA MÁXIMA!!! VIAGEM RECUSADA...");
        }
    }
}
