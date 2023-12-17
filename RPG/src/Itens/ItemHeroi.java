package Itens;

import java.util.ArrayList;

public abstract class ItemHeroi {

    private String nome;
    private int preco;
    ArrayList<String> heroisPermitidos;

    /**
     * Construtor Vazio - boa prática
     */
    public ItemHeroi() {
    }

    public abstract void exibirDetalhes();
}
