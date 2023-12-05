package Ex_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private String nome;
    private ArrayList<DisciplinaCurso> disciplinaCurso;
    private boolean longaDuracao;

    public Curso() {

        this.disciplinaCurso=new ArrayList<>();

        Scanner input = new Scanner(System.in);


        System.out.println("* * * *  N O V O   C U R S O  * * * *");

        String nome;
        int quantidadeDisciplinas;

        //nome
        System.out.println("Nome: ");
        nome=input.next();

        //quantidade
        System.out.println("Quantidade Disciplinas: ");
        quantidadeDisciplinas=input.nextInt();

        //ciclo para add disciplinas curso
        for (int i=0; i < quantidadeDisciplinas; i++){


        }
    }



}
