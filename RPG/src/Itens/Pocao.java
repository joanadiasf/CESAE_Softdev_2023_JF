package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pocao extends Consumivel{

    private int efeitoVida;
    private int aumentoForca;

    /**
     * Construtor Vazio - boa prática
     */
    public Pocao() {
    }

    @Override
    public  void exibirDetalhes() throws FileNotFoundException {

        lerFicheiro();


        System.out.println("Vida: " + this.efeitoVida);
        System.out.println("Aumento na Força: " + this.aumentoForca);
    }

    public void lerFicheiro()throws FileNotFoundException{


        Scanner fileScanner = new Scanner(new File("src/Itens/ItensHeroiRPG.csv"));

        String linha;
        linha = fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            String [] dividirLinha = linha.split(";");

            if (dividirLinha[0].equals("Pocao")){

                this.efeitoVida = Integer.parseInt(dividirLinha[7]);
                this.aumentoForca = Integer.parseInt(dividirLinha[8]);
            }

        }
    }
}
