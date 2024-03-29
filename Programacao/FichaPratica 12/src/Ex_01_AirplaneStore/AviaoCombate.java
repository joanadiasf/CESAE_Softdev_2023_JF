package Ex_01_AirplaneStore;

import Ex_01_AirplaneStore.Enums.Armas;

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

    public void addArma(Armas armaNova){

        if (this.arsenal.size() < 3){
            this.arsenal.add(armaNova);
        }

    }

    public void removeArma(int index){

        this.arsenal.remove(index);
    }

    public void listarArsenal(){

        System.out.println("Arsenal: ");
        System.out.println(this.arsenal);
        System.out.println();
    }
    @Override
    public void exibirDetalhes(){

        super.exibirDetalhes();
        System.out.println(this.paisOrigem);
        System.out.println(this.camuflagem);
        this.listarArsenal();

    }
}
