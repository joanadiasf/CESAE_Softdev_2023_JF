package CarRace;

import CarRace.Enums.TipoCombustivel;

public class Veiculo {

    private String marca;
    private String modelo;
    private int idade;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel combustivel;
    private double litros100Km;

    /**
     * construtor
     *
     * @param marca       - marca
     * @param modelo      - modelo
     * @param idade       - ano
     * @param potencia    - potencia em cavalos
     * @param cilindrada  - cilindrada
     * @param combustivel - combustivel
     * @param litros100Km - qts litros faz por cada 100km
     */
    public Veiculo(String marca, String modelo, int idade, int potencia, double cilindrada, TipoCombustivel combustivel, int litros100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.idade = idade;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros100Km = litros100Km;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getIdade() {
        return idade;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public double getLitros100Km() {
        return litros100Km;
    }

    /**
     * Método para ligar o carro
     */
    public void ligado() {

        if (idade <= 30) {

            if (potencia >= 250) {

                System.out.println("\nO carro está ligado! \nVRUUMMMMM");
                System.out.println();
                System.out.println("     _____     ");
                System.out.println("   /    | \\   ");
                System.out.println("|           ---|");
                System.out.println("----()----()---|");

            }
            if (potencia < 250) {

                System.out.println("\nO carro está ligado! \nVruummmmmmm");
                System.out.println();
                System.out.println("     _____     ");
                System.out.println("   /    | \\   ");
                System.out.println("|           ---|");
                System.out.println("----()----()---|");
            }
        }

        if (idade > 30) {

            if (combustivel == TipoCombustivel.DIESEL) {

                System.out.println("\nDeita um pouco de fumo... Custa a pegar... O carro está ligado! \nVrum-vrum-vrum");
                System.out.println();
                System.out.println("     _____         (  )");
                System.out.println("   /    | \\      _      )");
                System.out.println("|           ---|  _      )");
                System.out.println("----()----()---|   (  )");
            }

            if (combustivel != TipoCombustivel.DIESEL) {

                System.out.println("\nCusta a pegar...O carro está ligado! \nVrum-vrum-vrum");
                System.out.println();
                System.out.println("     _____     ");
                System.out.println("   /    | \\   ");
                System.out.println("|           ---|");
                System.out.println("----()----()---|");
            }
        }


    }

    /**
     * Método para a corrida de carros
     * @param adversario - carro concorrente
     * @return - carro vencedor
     */
    public Veiculo corrida(Veiculo adversario) {


        if (this.potencia > adversario.getPotencia()) {

            return this;

        } else {

            if (this.potencia < adversario.getPotencia()) {

                return adversario;

            } else {

                if (this.cilindrada > adversario.getCilindrada()) {

                    return this;

                } else {

                    if (this.cilindrada < adversario.getCilindrada()) {

                        return adversario;

                    } else {

                        if (this.idade < adversario.getIdade()) {

                            return this;

                        } else {

                            if (this.idade > adversario.getIdade()) {

                                return adversario;
                            }
                        }
                    }
                }

            }


        }


        return null;


    }

    /**
     * Método para exibir os detalhes
     */
    public void exibirDetalhes(){


        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Idade: " +this.idade);
        System.out.println("Potência: " +this.potencia + " cavalos");
        System.out.println("Cilindrada: " +this.cilindrada);



    }

    /**
     * Método para fazer calculo de gasto de qts litros se gastam por km
     * @param distancia - distancia percorrida
     * @return gasto de combustivel
     */
    public double litros(double distancia) {

        return (distancia * this.litros100Km)/100;

    }


}
