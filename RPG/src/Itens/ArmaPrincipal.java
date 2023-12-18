package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArmaPrincipal extends ItemHeroi{

    private int ataqueArma;
    private int ataqueEspecialArma;

    /**
     * Construtor Vazio - boa prática
     */
    public ArmaPrincipal() {
    }

    @Override
    public void exibirDetalhes() throws FileNotFoundException {


            lerFicheiro();


            System.out.println("Poder de Ataque: " + this.ataqueArma);
            System.out.println("Poder de Ataque Especial: " + this.ataqueEspecialArma);

    }

    public void lerFicheiro()throws FileNotFoundException{


        Scanner fileScanner = new Scanner(new File("src/Itens/ItensHeroiRPG.csv"));

        String linha;
        linha = fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            String [] dividirLinha = linha.split(";");

            if (dividirLinha[0].equals("ArmaPrincipal")){

                this.ataqueArma = Integer.parseInt(dividirLinha[4]);
                this.ataqueEspecialArma = Integer.parseInt(dividirLinha[5]);
            }

        }
    }
}
