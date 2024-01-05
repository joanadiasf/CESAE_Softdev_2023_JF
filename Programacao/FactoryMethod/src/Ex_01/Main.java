package Ex_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tipo de Produto [Livro][Eletronico][Roupa])");
        String tipo = input.next();

        System.out.println("Nome");
        String nome = input.next();

        System.out.println("Preço");
        double preco = input.nextDouble();

        Produto produtoUser = ProductFactory.criarProduto(tipo,nome,preco);

        produtoUser.mostrar();
    }
}
