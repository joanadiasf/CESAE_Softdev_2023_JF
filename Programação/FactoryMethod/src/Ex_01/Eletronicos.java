package Ex_01;

public class Eletronicos extends Produto{

    public Eletronicos(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Produto Categoria Eletronico: " + super.getNome());

    }
}
