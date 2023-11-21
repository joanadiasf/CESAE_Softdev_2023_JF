package Ex_06;

public class Atleta {

    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String pais;

    //construtor
    public Atleta(String nome, String modalidade, double altura, double peso, String pais) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.pais = pais;
    }

    /**
     * Exibir detalhes
     */
    public void exibirDetalhes(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Modalidade: " + this.modalidade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("País: " + this.pais);

    }

    public double getAltura() {
        return altura;
    }

    public Atleta competicaoAltura(Atleta participante){

        if (this.altura > participante.getAltura()){

            return this;
        }
        else {

            return participante;
        }
    }
}
