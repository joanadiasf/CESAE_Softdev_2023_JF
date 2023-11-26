package CarRace;

import CarRace.Enums.TipoCombustivel;

import java.util.Scanner;

public class Carro  extends Veiculo{

    private int quantidadePassageiros;

    //Construtor
    public Carro(String marca, String modelo, int idade, int potencia, double cilindrada, TipoCombustivel combustivel, int litros100Km, int quantidadePassageiros) {
        super(marca, modelo, idade, potencia, cilindrada, combustivel, litros100Km);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    /**
     * Método para calcular o custo da viagem
     * @param carroAnalisado - carro a ser analisado
     * @return - valor da viagem
     */
    public double calcularCusto(Carro carroAnalisado){

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos km serão feitos na viagem?");
        double viagem = input.nextDouble();

        if (carroAnalisado.getCombustivel()==TipoCombustivel.GASOLINA){

            return carroAnalisado.litros(viagem)*2.1;
        }

        if (carroAnalisado.getCombustivel()==TipoCombustivel.DIESEL){

            return carroAnalisado.litros(viagem)*1.95;
        }

        if (carroAnalisado.getCombustivel()==TipoCombustivel.GPL){

            return carroAnalisado.litros(viagem)*1.15;
        }

        else {
             //ELETRICO
            return carroAnalisado.litros(viagem)*0.12;
        }



    }
}
