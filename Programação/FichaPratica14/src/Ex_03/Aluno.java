package Ex_03;

import Ex_03.Enums.Curso;



public class Aluno extends Pessoa{

    private double mediaNotas;
    private String[][] pauta;
    private Curso curso;

    public Aluno(String nome, int anoNascimento, String email, String telemovel, double mediaNotas, String[][] pauta, Curso curso) {
        super(nome, anoNascimento, email, telemovel);
        this.mediaNotas = mediaNotas;
        this.pauta = new String[][2]; //todo: falta nr de disciplinas para controlar nr de linhas da pauta
        this.curso = curso;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
    
}
