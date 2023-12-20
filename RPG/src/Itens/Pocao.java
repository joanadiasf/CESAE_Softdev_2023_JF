package Itens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pocao extends Consumivel{

    public Pocao(String nome, int preco, int efeitoVida, int aumentoForca) {
        super(nome, preco, 0, 0, 0, efeitoVida, aumentoForca);
    }

    @Override
    public  void exibirDetalhes() throws FileNotFoundException {

        System.out.println("Nome: " + super.getNome());
        System.out.println("Vida: " + super.getEfeitoVida());
        System.out.println("Aumento na Força: " + super.getAumentoForca());
    }


}
