package Controllers;

import Domain.Venda;
import Model_Repository.VendasRepositorio;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientController {
    private ArrayList<Venda> todasVendas;

    public ClientController() throws FileNotFoundException {
        VendasRepositorio repositorio = new VendasRepositorio("Files/minimercado.csv");
        this.todasVendas= repositorio.getVendaArrayList();
    }

    public Venda produtoMaisCaro(){

        double precoMaisCaro=0;

        Venda vendaProdutoMaisCaro = null;

        for (Venda vendaAtual : this.todasVendas){

            if (vendaAtual.getPrecoUnitario() > precoMaisCaro){
                precoMaisCaro= vendaAtual.getPrecoUnitario();
                vendaProdutoMaisCaro=vendaAtual;
            }
        }

        return vendaProdutoMaisCaro;
    }
}
