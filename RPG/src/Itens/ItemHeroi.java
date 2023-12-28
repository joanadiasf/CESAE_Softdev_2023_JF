package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ItemHeroi {

    private String nome;
    private int preco;
    ArrayList<String> heroisPermitidos;
    private int ataqueArma;
    private int ataqueEspecialArma;
    private int AtaqueInstantaneo;

    private int efeitoVida;
    private int aumentoForca;

    /**
     * Construtor
     * @param nome nome item
     * @param preco preço
     * @param ataqueArma ataque
     * @param ataqueEspecialArma ataqueEspecial
     * @param ataqueInstantaneo ataqueInstantaneo
     * @param efeitoVida efeito
     * @param aumentoForca aumento de força
     */
    public ItemHeroi(String nome, int preco, int ataqueArma, int ataqueEspecialArma, int ataqueInstantaneo, int efeitoVida, int aumentoForca) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<>();
        this.ataqueArma = ataqueArma;
        this.ataqueEspecialArma = ataqueEspecialArma;
        AtaqueInstantaneo = ataqueInstantaneo;
        this.efeitoVida = efeitoVida;
        this.aumentoForca = aumentoForca;
    }

    //******************************************************************* GETTERs

    public String getNome() {
        return nome;
    }
    public int getPreco() {
        return preco;
    }
    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }
    public int getAtaqueArma() {
        return ataqueArma;
    }
    public int getAtaqueEspecialArma() {
        return ataqueEspecialArma;
    }
    public int getAtaqueInstantaneo() {
        return AtaqueInstantaneo;
    }
    public int getEfeitoVida() {
        return efeitoVida;
    }
    public int getAumentoForca() {
        return aumentoForca;
    }

    //******************************************************************* MÉTODOS

    public  void exibirDetalhes() throws FileNotFoundException{

        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);

        System.out.println("Heróis que podem usar item: " + this.heroisPermitidos);


    }



}
