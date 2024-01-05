package Ex_02;

import java.io.FileNotFoundException;

import static Lib.Biblioteca.imprimirFicheiro;

public class TacoVaca extends Produto{

    public TacoVaca(String nome) {
        super(nome);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Vaca: " + super.getNome());
    }

    @Override
    public void bake() throws FileNotFoundException {
        System.out.println("A cozinhar Taco de Vaca: " + super.getNome());
        imprimirFicheiro("src/TextFiles/taco.txt");
    }

    @Override
    public void box() {
        System.out.println("A embalar Taco de Vaca: " + super.getNome());

    }
}
