package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marca;

    //ArrayList <tipo de dados> nome = new ArrayList <>();
    ArrayList <Peixe> PeixesPescados = new ArrayList<>();
    ArrayList <Marisco> MariscoPescado = new ArrayList<>();


    /**
     * Construtor
     * @param nome - nome
     * @param cor - cor
     * @param anoFabrico - ano de fabrico
     * @param tripulacao - nr de tripulantes
     * @param capacidadeCarga - capacidade carga
     * @param marca - marca do barco
     */
    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        PeixesPescados = new ArrayList<>();
        MariscoPescado = new ArrayList<>();
    }


    public double getCargaAtual(){

        double cargaAtual=0;

        for(Peixe peixeAtual: this.PeixesPescados){

            cargaAtual+=peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual: this.MariscoPescado){

            cargaAtual+=mariscoAtual.getPeso();
        }

        return cargaAtual;
    }

    /**
     * Método para adicionar novo elemento ao array sobre a condição de capacidadeCarga
     * @param pescadoNovo - elemento a ser adicionado
     */
    public void pescarPeixe(Peixe pescadoNovo){


        if (pescadoNovo.getPeso()+this.getCargaAtual() <= this.capacidadeCarga){

            this.PeixesPescados.add(pescadoNovo);
            System.out.println("*** Peixe Pescado!!! ***");
        } else{

            System.out.println("***** Capacidade Máximo Atingida! *****");
        }

    }

    /**
     * Método para adicionar novo elemento ao array sobre a condição de capacidadeCarga
     * @param mariscoNovo - elemento a ser adicionado
     */
    public void pescarMarisco(Marisco mariscoNovo){

        if (mariscoNovo.getPeso()+this.getCargaAtual() <= this.capacidadeCarga){

            this.MariscoPescado.add(mariscoNovo);
            System.out.println("*** Marisco Pescado!!! ***");
        } else{

            System.out.println("***** Capacidade Máximo Atingida! *****");
        }
    }

    /**
     * Método para remover elemento do array
     * @param peixeRemovido - elemento a ser removido
     */
    public void largarPeixe(int index){

        PeixesPescados.remove(index);
        System.out.println("O peixefoi removido...");
    }

    /**
     * Método para remover elemento do array
     * @param mariscoRemovido - elemento a ser removido
     */
    public void largarMarisco(int index){

        MariscoPescado.remove(index);
        System.out.println("O marisco foi removido...");
    }

    public double calcularPrecoTotal(){

        double precoTotal=0;

        for(Peixe peixeAtual: this.PeixesPescados){

            double precoPeixeAtual= peixeAtual.getPeso()* peixeAtual.getPreco();
            precoTotal+=precoPeixeAtual;

        }

        for (Marisco mariscoAtual: this.MariscoPescado){

            double precoMariscoAtual = mariscoAtual.getPeso()* mariscoAtual.getPreco();
            precoTotal+=precoMariscoAtual;

        }

        return precoTotal;
    }

}
