package Entidades.Tools;

import Itens.ArmaPrincipal;
import Itens.ConsumivelCombate;
import Itens.ItemHeroi;
import Itens.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVLojaReader {

    private String filePath;

    public CSVLojaReader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<ItemHeroi> readCSVToRepository() throws FileNotFoundException{

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        //saltar cabeçalho
        String linha = scanner.nextLine();

        ArrayList<ItemHeroi> arrayLoja = new ArrayList<>();

        while (scanner.hasNextLine()){

            linha = scanner.nextLine();
            String [] linhaDividada = linha.split(";");

            String tipo = linhaDividada[0];
            String nome = linhaDividada[1];
            int preco = Integer.parseInt(linhaDividada[2]);

            linhaDividada[3]=linhaDividada[3].replace("[","");
            linhaDividada[3]=linhaDividada[3].replace("]","");
            String[] heroispermitidos = linhaDividada[3].split(",");

            int ataque = Integer.parseInt(linhaDividada[4]);
            int ataqueEspecial = Integer.parseInt(linhaDividada[5]);
            int ataqueInstantaneo = Integer.parseInt(linhaDividada[6]);
            int vida = Integer.parseInt(linhaDividada[7]);
            int forca = Integer.parseInt(linhaDividada[8]);


            ItemHeroi itemHeroiAtual=null;

            switch (tipo){
                case "ArmaPrincipal":
                    itemHeroiAtual= new ArmaPrincipal(nome,preco,ataque,ataqueEspecial,ataqueInstantaneo);
                    break;

                case "ConsumivelCombate":
                    itemHeroiAtual= new ConsumivelCombate(nome,preco,ataqueInstantaneo);
                    break;

                case "Pocao":
                    itemHeroiAtual= new Pocao(nome,preco,vida,forca);
                    break;
            }


            arrayLoja.add(itemHeroiAtual);
        }

        return arrayLoja;
    }
}
