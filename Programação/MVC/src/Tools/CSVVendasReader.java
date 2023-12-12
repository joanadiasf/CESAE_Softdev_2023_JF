package Tools;

import Domain.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVVendasReader {

   private String filePath;

    public CSVVendasReader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<Venda> readCSVToRepository() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(this.filePath));


        String linha = scanner.nextLine();


        ArrayList<Venda> arrayVenda=new ArrayList<>();

        while (scanner.hasNextLine()){

            linha=scanner.nextLine();
            String [] linhaDividida = linha.split(",");

            String tipoProduto= linhaDividida[0];
            String produto = linhaDividida[1];
            double quantidadeVendida= Double.parseDouble(linhaDividida[2]);
            double precoUnitario=Double.parseDouble(linhaDividida[3]);


            Venda vendaAtual = new Venda(tipoProduto,produto,quantidadeVendida,precoUnitario);

            arrayVenda.add(vendaAtual);
        }

        return  arrayVenda;

    }
}
