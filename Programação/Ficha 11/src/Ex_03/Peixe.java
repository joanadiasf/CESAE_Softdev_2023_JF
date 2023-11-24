package Ex_03;

public class Peixe {

    private String especie;
    private double peso;
    private double preco;

    /**
     * Construtor
     * @param especie - espécie do peixe
     * @param peso - peso (kg)
     * @param preco - preço por kg
     */
    public Peixe(String especie, double peso, double preco) {
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
