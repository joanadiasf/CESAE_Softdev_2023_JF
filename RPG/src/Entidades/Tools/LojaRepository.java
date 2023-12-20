package Entidades.Tools;

import Itens.ItemHeroi;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LojaRepository {

    private ArrayList<ItemHeroi> lojaArray;

    public LojaRepository(String filepath) throws FileNotFoundException{

        CSVLojaReader csvLojaReader = new CSVLojaReader(filepath);
        lojaArray = csvLojaReader.readCSVToRepository();
    }

    public  ArrayList<ItemHeroi> getLojaArray() {
        return lojaArray;
    }
}
