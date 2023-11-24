package AirplaneStore;

import AirplaneStore.Enums.Armas;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> arsenal;

    public AviaoCombate(int serial, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double asas, double cauda, int nrmotores, double autonomia, double velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(serial, modelo, anoFabrico, peso, comprimentoFuselagem, asas, cauda, nrmotores, autonomia, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;

        this.arsenal=new ArrayList<>();
    }
}
