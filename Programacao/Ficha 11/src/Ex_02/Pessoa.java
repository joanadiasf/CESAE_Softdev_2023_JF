package Ex_02;

public class Pessoa {

    private String nome;
    private int idade;
    private String telemovel;
    private String email;

    /**
     * Construtor
     * @param nome - nome
     * @param idade - idade
     * @param telemovel - telemovel
     * @param email - email
     */
    public Pessoa(String nome, int idade, String telemovel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.email = email;
    }

    /**
     * Método para exibir detalhes
     */
    public void exibirDetalhes(){

        System.out.println(this.nome + " | " + this.idade + " | " + this.telemovel + " | " + this.email);

    }

    public int getIdade() {
        return idade;
    }
}
