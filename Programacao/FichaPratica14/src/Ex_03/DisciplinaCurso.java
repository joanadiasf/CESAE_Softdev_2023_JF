package Ex_03;

import Ex_03.Entidades.Professor;

public class DisciplinaCurso {

    private Disciplina disciplina;
    private Professor professor;

    public DisciplinaCurso(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
