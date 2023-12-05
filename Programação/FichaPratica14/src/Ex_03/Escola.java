package Ex_03;

import Ex_03.Entidades.Aluno;
import Ex_03.Entidades.Funcionario;
import Ex_03.Entidades.Professor;
import Ex_03.*;

import java.util.ArrayList;

public class Escola {

    private String nome;
    private String localizacao;
    private int lotacaoMaxima;
    private ArrayList<Professor> listaProf;
    private ArrayList<Disciplina> listaDisciplinas;
    private ArrayList<Curso> listaCurso;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Funcionario> listaStaff;

    //Construtor
    public Escola(String nome, String localizacao, int lotacaoMaxima) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotacaoMaxima = lotacaoMaxima;
        this.listaProf=new ArrayList<>();
        this.listaDisciplinas=new ArrayList<>();
        this.listaCurso=new ArrayList<>();
        this.listaAlunos=new ArrayList<>();
        this.listaStaff=new ArrayList<>();
    }

    public void addProf(Professor profNovo){

        this.listaProf.add(profNovo);
    }

    public void addDisciplina(Disciplina disciplinaNova){

        this.listaDisciplinas.add(disciplinaNova);
    }
    public void addCurso(Curso cursoNovo){

        this.listaCurso.add(cursoNovo);
    }
    public void addAluno(Aluno alunoNovo){

        this.listaAlunos.add(alunoNovo);
    }
    public void addStaff(Funcionario staffNovo){

        this.listaStaff.add(staffNovo);
    }

    public void imprimirDisciplinas(){

        int contador=1;

        for (Disciplina disciplinaAtual : this.listaDisciplinas){

            System.out.println(contador++ + ": " );
            disciplinaAtual.exibirDetalhes();

            System.out.println();
        }
    }
}
