package Ex_02;

public class TacoVaca extends Produto{

    public TacoVaca(String nome) {
        super(nome);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Vaca: " + super.getNome());
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco de Vaca: " + super.getNome());

    }

    @Override
    public void box() {
        System.out.println("A embalar Taco de Vaca: " + super.getNome());

    }
}
