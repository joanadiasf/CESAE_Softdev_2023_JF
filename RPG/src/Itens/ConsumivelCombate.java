package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsumivelCombate extends Consumivel{


    public ConsumivelCombate(String nome, int preco,  int ataqueInstantaneo) {
        super(nome, preco, 0, 0, ataqueInstantaneo,0, 0);
    }


}
