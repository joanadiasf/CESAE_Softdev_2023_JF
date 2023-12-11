package Ex_01;

public class ProductFactory {

    public static Produto criarProduto(String tipoProduto,String nome, double preco){

        switch (tipoProduto){

            case "livro":

            return  new Livro(nome,preco);

            case "eletronico":

            return new Eletronicos(nome, preco);

            case "roupa":

            return new Roupa(nome, preco);

            default:
                throw new IllegalArgumentException("Tipo de Produto inválido");
        }
    }
}
