package Ex_03.Entidades;

import Ex_03.Enums.Funcao;



public class Funcionario extends Pessoa{

    private Funcao funcao;

    /**
     * Construtor
     * @param nome - nome
     * @param anoNascimento - ano de nascimento
     * @param email - email
     * @param telemovel - telemovel
     */
    public Funcionario(String nome, int anoNascimento, String email, String telemovel) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = funcao;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
