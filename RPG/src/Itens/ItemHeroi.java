package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ItemHeroi {

    private String nome;
    private int preco;
    ArrayList<String> heroisPermitidos;

    /**
     * Construtor Vazio - boa prática
     */
    public ItemHeroi() {
    }

    //ir ver Biblioteca

    public  void exibirDetalhes() throws FileNotFoundException{


        lerFicheiro();


        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);

        System.out.println("Heróis que podem usar item: " + this.heroisPermitidos);


    }
    public void lerFicheiro()throws FileNotFoundException{


        Scanner fileScanner = new Scanner(new File("src/Itens/ItensHeroiRPG.csv"));

        String linha;
        linha = fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            linha = fileScanner.nextLine();

            String [] dividirLinha = linha.split(";");


            this.nome = dividirLinha[1];
            this.preco = Integer.parseInt(dividirLinha[2]);

            String [] heroisPode = dividirLinha[3].split(",");

            for (int i=0; heroisPode.length > i;i++){

                this.heroisPermitidos.add(heroisPode[i]);
            }


        }
    }


}
