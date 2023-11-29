package PizzariaPt2;

import PizzariaPt2.Ingredientes;

public class IngredientesPizza {

    private Ingredientes ingrediente;
    private double quantidade;

    //construtor
    public IngredientesPizza(Ingredientes ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }


    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public void setIngredientes(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

}
