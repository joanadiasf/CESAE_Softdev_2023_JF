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
    public ConsumivelCombate(String nome, int preco,  int ataqueInstantaneo) {
        super(nome, preco, 0, 0, ataqueInstantaneo,0, 0);
    }

    @Override
    public void exibirDetalhes() throws FileNotFoundException {

        System.out.println("Nome: " + super.getNome());
        System.out.println("Ataque: " + super.getAtaqueInstantaneo());
    }
}
