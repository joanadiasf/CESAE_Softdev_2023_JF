package Ex_03;

import Ex_03.Enums.Curso;

import java.util.ArrayList;

public class Aluno extends Pessoa{

    private double mediaNotas;
    private String[][] pauta;
    private Curso curso;

    public Aluno(String nome, int anoNascimento, String email, String telemovel, double mediaNotas, String[][] pauta) {
        super(nome, anoNascimento, email, telemovel);
        this.mediaNotas = mediaNotas;
        this.pauta = pauta;
        this.curso = curso;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
