package Ex_02;

public abstract class Produto {

    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void box();
}
