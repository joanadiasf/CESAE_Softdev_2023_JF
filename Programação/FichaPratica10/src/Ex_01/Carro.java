package Ex_01;

public class Carro {

    private String marca;
    private String modelo;
    private int idade;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel combustivel;
    private int litros100Km;

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
    public Carro(String marca, String modelo, int idade, int potencia, double cilindrada, TipoCombustivel combustivel, int litros100Km) {
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
                System.out.println("     _____     ");
                System.out.println("   /    | \\   ");
                System.out.println("|           ---|");
                System.out.println("----()----()---|");
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

    public Carro corrida(Carro adversario) {


        if (this.potencia > adversario.getPotencia()) {
            return this;
        }

        if (this.potencia < adversario.getPotencia()) {

            return adversario;
        }

            if (this.potencia == adversario.getPotencia()) {

                if (this.cilindrada > adversario.getCilindrada()) {

                    return this;
                }
                if (this.cilindrada < adversario.getCilindrada()) {

                    return adversario;
                }

                if (this.cilindrada == adversario.getCilindrada()) {

                    if (this.idade < adversario.getIdade()) {

                        return this;
                    }

                    if (this.idade > adversario.getIdade()) {

                        return adversario;
                    }
                }


            }




    }


    //conferir conta
    public int litros(int distancia) {

        return distancia * this.litros100Km;

    }


}
