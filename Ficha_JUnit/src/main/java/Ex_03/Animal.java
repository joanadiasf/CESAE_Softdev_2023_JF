package Ex_03;

public class Animal {

    private String nome;
    private boolean comFome;
    private Alimento tipoAlimentacao;

    /**
     * Construtor
     * @param nome - nome animal
     * @param comFome - se animal está com fome
     * @param tipoAlimentacao - tipo alimentação
     */
    public Animal(String nome, boolean comFome, Alimento tipoAlimentacao) {
        this.nome = nome;
        this.comFome = comFome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getNome(){
        return nome;
    }

    public boolean estaComFome(){
        return comFome;
    }

    public Alimento getTipoAlimentacao(){
        return tipoAlimentacao;
    }

    public void comer(Alimento comida){
        if (tipoAlimentacao==comida){
            comFome=false;
            System.out.println(nome+ " comeu " + comida + ".");
        }
        else {
            System.out.println(nome+ " nao comeu " + comida + ".");

        }
    }
}
