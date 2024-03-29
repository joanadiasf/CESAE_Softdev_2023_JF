package Ex_01;

public abstract class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void mostrar();

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
