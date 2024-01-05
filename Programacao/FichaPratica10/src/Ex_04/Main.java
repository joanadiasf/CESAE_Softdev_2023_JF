package Ex_04;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Imovel casita = new Imovel("Rua dos Lamentos", "666","Infernus", Tipo.MANSAO, Acabamento.NOVA_COM_ACABAMENTO,200,3,2,10);
        Imovel caixa = new Imovel("Caixa de Cartão","0","Depois da ponte",Tipo.CASA,Acabamento.USADA,5,1,0,0);

        System.out.println();
        System.out.println("Valor Imóvel : "+ casita.getRua());
        System.out.println(casita.valorImovel());
        System.out.println();

        System.out.println("Detalhes: " );
        casita.exibirDetalhesDesenho();

        System.out.println();
        System.out.println("Valor Imóvel : "+ caixa.getRua());
        System.out.println(caixa.valorImovel());
        System.out.println();

        System.out.println("Detalhes: " );
        caixa.exibirDetalhesDesenhoCaixa();

        System.out.println();

        System.out.println("Imóvel mais caro:");
        casita.maisCaro(caixa).exibirDetalhesDesenho();

    }
}
