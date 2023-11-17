package Ex_02;

public class Cao {

    private String nome;
    private String raca;

    private String latido ="Au au au";

    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }

    public String getLatido() {
        return this.latido;
    }

    /**
     * Método construtor do Cao
     * @param nome - nome
     * @param raca - raça
     * @param latido - latido
     */
    public Cao(String nome, String raca, String latido) {
        this.nome = nome;
        this.raca = raca;
        this.latido = latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }
}
