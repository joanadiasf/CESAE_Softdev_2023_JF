package Ex_02;

public class TacoFrango extends Produto{

    public TacoFrango(String nome) {
        super(nome);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Frango: " + super.getNome());

    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco de Frango: " + super.getNome());

    }

    @Override
    public void box() {
        System.out.println("A embalar Taco de Frango: " + super.getNome());

    }
}
