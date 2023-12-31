package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArmaPrincipal extends ItemHeroi{

    /**
     * Construtor
     * @param nome - nome
     * @param preco - preço
     * @param ataqueArma - ataque
     * @param ataqueEspecialArma - ataque especial
     * @param ataqueInstantaneo - ataque instantaneo
     */
    public ArmaPrincipal(String nome, int preco, int ataqueArma, int ataqueEspecialArma, int ataqueInstantaneo ) {
        super(nome, preco, ataqueArma, ataqueEspecialArma, ataqueInstantaneo,0,0);
    }




}
