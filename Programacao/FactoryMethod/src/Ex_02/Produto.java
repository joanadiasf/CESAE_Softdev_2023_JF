package Ex_02;

import java.io.FileNotFoundException;

public abstract class Produto {

    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void prepare();
    public abstract void bake() throws FileNotFoundException;
    public abstract void box();


}
