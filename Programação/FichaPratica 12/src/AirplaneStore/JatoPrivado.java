package AirplaneStore;

import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacoes;

import java.util.ArrayList;

public class JatoPrivado extends Aviao{

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacoes> instalacoes;

    public JatoPrivado(int serial, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double asas, double cauda, int nrmotores, double autonomia, double velocidadeMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(serial, modelo, anoFabrico, peso, comprimentoFuselagem, asas, cauda, nrmotores, autonomia, velocidadeMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes= new ArrayList<>();
    }


    public void addInstalacao(Instalacoes instalacaoNova){

        this.instalacoes.add(instalacaoNova);
    }

    public void removeInstalacoes(int index){

        this.instalacoes.remove(index);
    }

    public void listarInstalacoes(){

        System.out.println();
        System.out.println("Instalações: ");
        System.out.println(this.instalacoes);

    }

    @Override
    public void exibirDetalhes(){
        //imprimir detalhes aviao
        super.exibirDetalhes();

        //add as que quero exibir desta classe
        System.out.println(this.lotacao);
        System.out.println(this.categoria);
        this.listarInstalacoes();

    }

}
