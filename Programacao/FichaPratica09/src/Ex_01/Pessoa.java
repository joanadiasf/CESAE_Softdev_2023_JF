package Ex_01;

public class Pessoa {

    //definir atributos de instância
    private String nome;
    private int idade;
    private double altura;

    /**
     * Método construtor de Pessoa
     * @param nome - nome da Pessoa
     * @param idade - idade da Pessoa
     * @param altura - altura da Pessoa (metro)
     */
    Pessoa(String nome, int idade, double altura){

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
