package PizzariaPt2.Ingrediente_da_Pizza;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Enums.Origem;
import PizzariaPt2.Ingredientes;

public class Topping extends Ingredientes {

    private Origem origemIngrediente;

    public Topping(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente) {
        super(codigo, nome, medidaIngrediente, kcal);
        this.origemIngrediente = origemIngrediente;
    }
}
