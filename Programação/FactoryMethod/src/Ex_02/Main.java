package Ex_02;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("Tipo de Taco [frango][vaca][vegetariano] ********");
        String tipo = input.next();

        System.out.println("Nome: ");
        String nome = input.next();

        Produto produtoUser = ProductFactory.criarProduto(tipo,nome);

        produtoUser.prepare();
        sleep(3000);
        produtoUser.bake();
        sleep(3000);
        produtoUser.box();

    }
}
