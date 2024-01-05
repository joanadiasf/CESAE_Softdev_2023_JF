package Ex_03;

public class Marisco {

    private String especie;
    private double peso;
    private double preco;

    /**
     * Construtor
     * @param especie - espécie do marisco
     * @param peso - peso (kg)
     * @param preco - preço por kg
     */
    public Marisco(String especie, double peso, double preco) {
        this.especie = especie;
        this.peso = peso;
        this.preco = preco;
    }


    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }
}
