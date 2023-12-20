package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArmaPrincipal extends ItemHeroi{

    public ArmaPrincipal(String nome, int preco, int ataqueArma, int ataqueEspecialArma, int ataqueInstantaneo ) {
        super(nome, preco, ataqueArma, ataqueEspecialArma, ataqueInstantaneo,0,0);
    }

    @Override
    public void exibirDetalhes() throws FileNotFoundException {


    }


}
