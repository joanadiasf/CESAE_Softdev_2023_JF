package Ex_03;

import Ex_03.Enums.Funcao;

import java.util.ArrayList;

public class Funcionario extends Pessoa{

    private ArrayList<Funcao> funcao;

    /**
     * Construtor
     * @param nome - nome
     * @param anoNascimento - ano de nascimento
     * @param email - email
     * @param telemovel - telemovel
     */
    public Funcionario(String nome, int anoNascimento, String email, String telemovel) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = new ArrayList<>();
    }

    @Override
    public void obterFuncao() {
        
    }

    @Override
    public void imprimirHorario() {

    }
}
