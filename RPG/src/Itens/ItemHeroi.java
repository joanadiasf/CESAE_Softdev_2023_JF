package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ItemHeroi {

    private String nome;
    private int preco;
    String[] heroisPermitidos;
    private int ataqueArma;
    private int ataqueEspecialArma;
    private int AtaqueInstantaneo;

    private int efeitoVida;
    private int aumentoForca;

    /**
     *
     * @param nome nome
     * @param preco preço
     * @param heroispermitidos herois array
     * @param ataqueArma - ataque
     * @param ataqueEspecialArma - ataque especial
     * @param ataqueInstantaneo - ataque instaneo
     * @param efeitoVida - efeito na vida
     * @param aumentoForca - aumento na força
     */
    public ItemHeroi(String nome, int preco, String[] heroispermitidos, int ataqueArma, int ataqueEspecialArma, int ataqueInstantaneo, int efeitoVida, int aumentoForca) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = heroispermitidos;
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
    public String [] getHeroisPermitidos() {
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

        System.out.println("Heróis que podem usar item: " );

        for (String itemHeroiAtual : heroisPermitidos){

            System.out.print(itemHeroiAtual+ ";");

        }

    }



}
