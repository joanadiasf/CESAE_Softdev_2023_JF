package Ex_02;

import java.io.FileNotFoundException;

import static Lib.Biblioteca.imprimirFicheiro;

public class TacoFrango extends Produto{

    public TacoFrango(String nome) {
        super(nome);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Frango: " + super.getNome());

    }

    @Override
    public void bake() throws FileNotFoundException {
        System.out.println("A cozinhar Taco de Frango: " + super.getNome());

        imprimirFicheiro("src/TextFiles/taco.txt");
    }

    @Override
    public void box() {
        System.out.println("A embalar Taco de Frango: " + super.getNome());

    }
}
