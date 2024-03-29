package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsumivelCombate extends Consumivel{

    /**
     * Construtor
     * @param nome - nome
     * @param preco- preço
     * @param ataqueInstantaneo - ataque instantaneo
     */

    public ConsumivelCombate(String nome, int preco, String[] heroispermitidos, int ataqueArma, int ataqueEspecialArma, int ataqueInstantaneo, int efeitoVida, int aumentoForca) {
        super(nome, preco, heroispermitidos, 0, 0, ataqueInstantaneo, 0, 0);
    }

    @Override
    public void exibirDetalhes() throws FileNotFoundException {

        System.out.println("Nome: " + super.getNome());
        System.out.println("Preço: " + this.getPreco());

        System.out.println("Ataque: " + super.getAtaqueInstantaneo());
        System.out.println("Heróis que podem usar item: " );

        for (String itemHeroiAtual : heroisPermitidos){

            System.out.print(itemHeroiAtual+ ";");

        }
        System.out.println("\n");
    }
}
