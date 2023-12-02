package Ex_03_1_Pizzaria;

public class IngredientePizza {

    private Ingrediente ingrediente;
    private double quantidade;

    //construtor
    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }


    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }


}

//é tipo tabela intermedia da base de dados