package Ex_05;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Agenda agenda = new Agenda();

        Pessoa shrek = new Pessoa("Shrek",30,"pantano.buebue.longe@gmail.com","123");
        Pessoa obito = new Pessoa("Obito Uchiha", 25,"madara2.0@gmail.com","456");


        System.out.println();
        shrek.exibirDetalhesAparencia2();

        System.out.println();
        obito.exibirDetalhesAparencia1();


        agenda.addPessoa(shrek);
        agenda.addPessoa(obito);

        agenda.listaPessoa();
    }
}
