package Ex_02;

import java.io.FileNotFoundException;

import static Lib.Biblioteca.imprimirFicheiro;

public class TacoVegetariano extends Produto{

    public TacoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar Taco Vegetariano: " + super.getNome());

    }

    @Override
    public void bake() throws FileNotFoundException {
        System.out.println("A cozinhar Taco Vegetariano: " + super.getNome());
        imprimirFicheiro("src/TextFiles/taco.txt");
    }

    @Override
    public void box() {
        System.out.println("A embalar Taco Vegetariano: " + super.getNome());

    }
}
