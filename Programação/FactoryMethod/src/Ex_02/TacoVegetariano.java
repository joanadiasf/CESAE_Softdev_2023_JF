package Ex_02;

public class TacoVegetariano extends Produto{

    public TacoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar Taco Vegetariano: " + super.getNome());

    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco Vegetariano: " + super.getNome());

    }

    @Override
    public void box() {
        System.out.println("A embalar Taco Vegetariano: " + super.getNome());

    }
}
