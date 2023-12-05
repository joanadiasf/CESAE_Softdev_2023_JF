package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {

    private String nome;

    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    /**
     * Método construtor apartir da consola
     */
    public Disciplina(){

        Scanner input = new Scanner(System.in);

        System.out.println("* * * *  N O V A   D I S C I P L I N A  * * * *");

        //declarar variaveis
        String nome;
        AreaFormacao areaFormacao;
        String areaString;
        int duracao;

        //nome
        System.out.println("Adicione o nome da Disciplina");
        nome=input.next();

        //area

        System.out.println("* *  Á R E A S  D E  F O R M A Ç Ã O  * *");
        for (AreaFormacao areaAtual : AreaFormacao.values()){
            System.out.println( areaAtual);

        }

        System.out.println("Qual a área de Formação:");
        areaString=input.next();
        areaString=areaString.toUpperCase();

        AreaFormacao.valueOf(areaString);

        //duracao
        System.out.println("Qual a duração? (em horas)?");
        duracaoHoras= input.nextInt();

    }

    public String getNome() {
        return nome;
    }

    public AreaFormacao getArea() {
        return area;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void exibirDetalhes(){

        System.out.print("Nome: " + this.nome);
        System.out.print("\t| Área de Formação: " + this.area);
        System.out.print("\t| Duração: " + this.duracaoHoras + "h. ");
    }
}
