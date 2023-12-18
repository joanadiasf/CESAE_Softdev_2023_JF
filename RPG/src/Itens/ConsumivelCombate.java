package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsumivelCombate extends Consumivel{

    private int AtaqueInstantaneo;

    /**
     * Construtor Vazio - boa prática
     */
    public ConsumivelCombate() {
    }

    public  void exibirDetalhes() throws FileNotFoundException {


        lerFicheiro();


        System.out.println("Ataque Instantaneo: " + this.AtaqueInstantaneo);

    }

    public void lerFicheiro()throws FileNotFoundException{


        Scanner fileScanner = new Scanner(new File("src/Itens/ItensHeroiRPG.csv"));

        String linha;
        linha = fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            String [] dividirLinha = linha.split(";");

            if (dividirLinha[0].equals("ConsumivelCombate")){

                this.AtaqueInstantaneo = Integer.parseInt(dividirLinha[6]);
            }

        }
    }
}
