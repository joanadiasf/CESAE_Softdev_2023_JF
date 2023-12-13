package Model_Repository;

import Domain.Venda;
import Tools.CSVVendasReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepositorio {

    private ArrayList <Venda> vendaArrayList;

    public VendasRepositorio(String filePath) throws FileNotFoundException {
        CSVVendasReader csvVendasReader = new CSVVendasReader(filePath);
        this.vendaArrayList= csvVendasReader.readCSVToRepository();
    }

    public ArrayList<Venda> getVendaArrayList() {
        return vendaArrayList;
    }
}
