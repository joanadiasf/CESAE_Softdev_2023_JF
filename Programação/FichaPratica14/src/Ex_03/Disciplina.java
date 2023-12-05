package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {

    private String nome;

    private AreaFormacao area;
    private int duracaoHoras;



    public void criarDisciplina(){

        Scanner input = new Scanner(System.in);

        System.out.println("Adicione o nome da Disciplina");
        this.nome = input.next();

        System.out.println("Adicione área de Formação:");
        this.area = AreaFormacao.valueOf(input.next());

        System.out.println("Qual a duração? (em horas)?");
        this.duracaoHoras= input.nextInt();
    }


}
