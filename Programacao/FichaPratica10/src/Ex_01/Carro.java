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

    public Carro corrida(Carro adversario) {


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

    public void exibirDetalhes(){


    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " +this.modelo);
    System.out.println("Idade: " +this.idade);
    System.out.println("Potência: " +this.potencia + " cavalos");
    System.out.println("Cilindrada: " +this.cilindrada);



}


    //conferir conta
    public int litros(int distancia) {

        return distancia * this.litros100Km;

    }


}
