package Itens;

import java.io.FileNotFoundException;

public class Consumivel extends ItemHeroi{

    public Consumivel(String nome, int preco, int ataqueArma, int ataqueEspecialArma, int ataqueInstantaneo, int efeitoVida, int aumentoForca) {
        super(nome, preco, ataqueArma, ataqueEspecialArma, ataqueInstantaneo, efeitoVida, aumentoForca);
    }

    @Override
    public void exibirDetalhes() throws FileNotFoundException {


    }


}
