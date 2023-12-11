import Enums.*;

public class Carro  extends Veiculo{

    private int quantidadePassageiros;

    //Construtor
    public Carro(String marca, String modelo, int idade, int potencia, double cilindrada, TipoCombustivel combustivel, int litros100Km, int quantidadePassageiros) {
        super(marca, modelo, idade, potencia, cilindrada, combustivel, litros100Km);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    /**
     * Método para calcular o custo da viagem
     * @param viagem - numero de km
     * @return - valor da viagem
     */
    public double calcularCusto(Double viagem){



        if (this.getCombustivel()==TipoCombustivel.GASOLINA){

            return this.litros(viagem)*2.1;
        }

        if (this.getCombustivel()==TipoCombustivel.DIESEL){

            return this.litros(viagem)*1.95;
        }

        if (this.getCombustivel()==TipoCombustivel.GPL){

            return this.litros(viagem)*1.15;
        }

        else {
             //ELETRICO
            return this.litros(viagem)*0.12;
        }



    }
}
