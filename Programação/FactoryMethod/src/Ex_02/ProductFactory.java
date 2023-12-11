package Ex_02;

public class ProductFactory {

    public static Produto criarProduto(String tipoProduto,String nome){

        switch (tipoProduto){

            case "frango":
                return new TacoFrango(nome);

            case "vaca":
                return new TacoVaca(nome);

            case "vegetariano":
                return new TacoVegetariano(nome);

            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido");
        }


    }
}
