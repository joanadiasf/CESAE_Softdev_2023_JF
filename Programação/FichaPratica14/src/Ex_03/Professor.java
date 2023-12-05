package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private int nivelAcademico;
    private ArrayList<AreaFormacao> areaFormacao;

    /**
     * Construtor
     * @param nome - nome
     * @param anoNascimento - ano de Nascimento
     * @param email - email
     * @param telemovel - Numero de Telemóvel
     * @param nivelAcademico - nivel academico
     */
    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.nivelAcademico = nivelAcademico;
        this.areaFormacao = new ArrayList<>();
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }


}
