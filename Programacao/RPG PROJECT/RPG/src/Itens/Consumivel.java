package Itens;

import java.io.FileNotFoundException;

public class Consumivel extends ItemHeroi{

    /**
     * Construtor
     * @param nome - nome
     * @param preco - preço
     * @param ataqueArma - ataque
     * @param ataqueEspecialArma - ataque especial
     * @param ataqueInstantaneo - ataque instantaneo
     * @param efeitoVida - efeito na vida
     * @param aumentoForca - efeito na força
     */
    public Consumivel(String nome, int preco, String[] heroispermitidos, int ataqueArma, int ataqueEspecialArma, int ataqueInstantaneo, int efeitoVida, int aumentoForca) {
        super(nome, preco, heroispermitidos, ataqueArma, ataqueEspecialArma, ataqueInstantaneo, efeitoVida, aumentoForca);
    }

    @Override
    public  void exibirDetalhes() throws FileNotFoundException{

        System.out.println("Nome: " + this.getNome());
        System.out.println("Preço: " + this.getPreco());

        System.out.println("Heróis que podem usar item: " );

        for (String itemHeroiAtual : heroisPermitidos){

            System.out.print(itemHeroiAtual+ ";");

        }

        System.out.println("\n");
    }


}
