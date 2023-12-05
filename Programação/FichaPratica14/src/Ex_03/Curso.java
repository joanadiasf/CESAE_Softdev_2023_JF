package Ex_03;

import Ex_03.Entidades.Professor;
import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private String nome;
    private ArrayList<DisciplinaCurso> disciplinaCurso;
    private boolean longaDuracao;

    public Curso(Escola escola) {

        this.disciplinaCurso=new ArrayList<>();

        Scanner input = new Scanner(System.in);


        System.out.println("* * * *  N O V O   C U R S O  * * * *");

        String nome;
        int quantidadeDisciplinas;
        int codDisciplina;
        int codProf;

        //nome
        System.out.println("Nome: ");
        nome=input.next();

        //quantidade
        System.out.println("Quantidade Disciplinas: ");
        quantidadeDisciplinas=input.nextInt();

        //ciclo para add disciplinas curso
        for (int i=0; i < quantidadeDisciplinas; i++){

            escola.imprimirDisciplinas();
            System.out.println("Código Disciplina: ");
            codDisciplina=input.nextInt();
            codDisciplina--;

            Disciplina disciplina= escola.getListaDisciplinas().get(codDisciplina);

            ArrayList<Professor> professoresCompetentes = new ArrayList<>();

            for (Professor professorAtual : escola.getListaProfessores()){

                for (AreaFormacao areaFormacaoAtual : professorAtual.getAreaFormacao()){

                    if (areaFormacaoAtual.equals(disciplina.getArea())){
                        professoresCompetentes.add(professorAtual);
                    }
                }
            }

            System.out.println("*!*! PROFESSORES COMPETENTES  *!*!");
            for (Professor professorAtual : professoresCompetentes){

                System.out.println();
                professorAtual.exibirDetalhesMinimos();
            }

            System.out.println("Código Professor: ");
            codProf=input.nextInt();

            Professor professor=professoresCompetentes.get(codProf);

            DisciplinaCurso disciplinaCurso1 = new DisciplinaCurso(disciplina,professor);
            this.disciplinaCurso.add(disciplinaCurso1);
        }
    }

    public int calcularDuracao(){

        int duracaoTotal=0;

        for (DisciplinaCurso disciplinaCursoAtual : this.disciplinaCurso){

            duracaoTotal+= duracaoTotal.getDisciplina().getDuracao
        }
    }

}
