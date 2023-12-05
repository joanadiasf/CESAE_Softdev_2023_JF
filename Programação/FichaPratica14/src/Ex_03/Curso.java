package Ex_03;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private ArrayList<DisciplinaCurso> disciplinaCurso;
    private boolean longaDuracao;

    public Curso(String nome, boolean longaDuracao) {
        this.nome = nome;
        this.longaDuracao = longaDuracao;
        this.disciplinaCurso = new ArrayList<>();
    }



}
