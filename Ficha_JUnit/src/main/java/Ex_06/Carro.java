package Ex_06;

import java.util.Scanner;

public class Carro {

    // Atributos de instancia
    private String marca;
    private String modelo;
    private int anoFabrico,potencia,cilindrada;
    private double consumoL100;
    private TipoCombustivel combustivel;
    private int idade;

    // Metodo construtor
    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumoL100 = consumoL100;
        this.combustivel = combustivel;
    }


    /**
     * Metodo para calcular a idade em 2023
     * @return Idade em 2023
     */
    public int getIdade(){
        return 2024-anoFabrico;
    }

    /**
     * Metodo que imprime na consola que o carro esta ligado
     */
    public void ligar(){

        if(this.idade>30){ // Carro tem mais de 30 anos
            if(combustivel.equals(TipoCombustivel.DIESEL)){
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro esta ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else{
                System.out.println("Custa a pegar... O carro esta ligado!");
            }

        }else{ // Carro tem 30 ou menos anos
            if(this.potencia>=250){ // Carro tem 250 ou mais cavalos
                System.out.println("VRUUMMMMMM");
            }else{
                System.out.println("Vruummmmmmm");
            }

        }
    }

    /**
     * Metodo para introduzir um carro com base nos valores introduzidos pelo utilizador
     * @return Carro preenchido
     */
    public static Carro introduzirCarro(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n***** Novo Carro  *****");
        System.out.print("Insira a Marca: ");
        String marca = input.next();

        System.out.print("Insira o Modelo: ");
        String modelo = input.next();

        System.out.print("Insira o Ano de Fabrico: ");
        int ano = input.nextInt();

        System.out.print("Insira a Potencia: ");
        int potencia = input.nextInt();

        System.out.print("Insira a Cilindrada: ");
        int cilindrada = input.nextInt();

        System.out.print("Insira o tipo de combustivel do carro (GASOLINA, DIESEL ou GPL): ");
        TipoCombustivel tipoCombustivel = TipoCombustivel.valueOf(input.next().toUpperCase());

        System.out.print("Insira o Consumo: ");
        double consumoL100 = input.nextDouble();

        Carro carroUtilizador = new Carro(marca,modelo,ano,potencia,cilindrada,tipoCombustivel, consumoL100);
        return carroUtilizador;
    }

    /**
     * Metodo para imprimir todos os detalhes de um carro
     */
    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano Fabrico: "+this.anoFabrico);
        System.out.println("Potência: "+this.potencia+" HP");
        System.out.println("Cilindrada: "+this.marca+" cc");
        System.out.println("Tipo de Combustivel: "+this.combustivel);
        System.out.println("Consumo (L/100): "+this.consumoL100);
    }

    /**
     * Metodo para fazer uma corrida com 2 carros
     * @param adversario Oponente na corrida
     * @return Carro vencedor
     */
    public Carro corrida(Carro adversario){
        if(this.potencia>adversario.potencia){ //Ganha o Carro por potencia
            return this;
        } else if (adversario.potencia>this.potencia) { // Ganha o adversario por potencia
            return adversario;
        } else { // Empate de potencia
            if(this.cilindrada>adversario.cilindrada){ //Ganha o Carro por cilindrada
                return this;
            } else if (adversario.cilindrada>this.cilindrada) { // Ganha o adversario por cilindrada
                return adversario;
            } else { // Empate de cilindrada
                if(this.anoFabrico>adversario.anoFabrico){ // Ganha o carro por ser mais recente
                    return this;
                } else if (adversario.anoFabrico>this.anoFabrico) { // Ganha o adversario por ser mais recente
                    return adversario;
                }
            }
        }

        return null;
    }

    /**
     * Metodo que calcula o consumo em Litros de um carro ao longo de uma distancia
     * @param distancia - Em km da viagem
     * @return litros consumidos na viagem
     */
    public double calcularConsumo(double distancia){
        return distancia*(this.consumoL100/100);
    }
}
