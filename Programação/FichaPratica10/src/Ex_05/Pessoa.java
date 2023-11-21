package Ex_05;

import java.io.FileNotFoundException;

import static Lib.BibliotecaFicheiros.imprimirFicheiro;

public class Pessoa {


    private String nome;
    private int idade;
    private String email;
    private String contacto;



    /**
     *Construtor
     * @param nome - nome
     * @param idade - idade
     * @param email - email
     * @param contacto - contacto
     */
    public Pessoa(String nome, int idade, String email, String contacto) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.contacto = contacto;
    }

    //exibir detalhes
    public void exibirDetalhesAparencia1() throws FileNotFoundException {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("E-mail: " + this.email);
        System.out.println("Contacto: " + this.contacto);

        System.out.println();
        imprimirFicheiro("Files/obitoUchiha.txt");
        System.out.println();
    }

    public void exibirDetalhesAparencia2() throws FileNotFoundException {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("E-mail: " + this.email);
        System.out.println("Contacto: " + this.contacto);

        System.out.println();
        imprimirFicheiro("Files/shrek.txt");
        System.out.println();
    }

    public void exibirDetalhes() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("E-mail: " + this.email);
        System.out.println("Contacto: " + this.contacto);


    }

}
