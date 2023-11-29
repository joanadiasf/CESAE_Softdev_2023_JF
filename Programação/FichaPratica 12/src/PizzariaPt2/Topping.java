package PizzariaPt2;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Enums.Origem;

public class Topping extends Ingredientes{

    private Origem origemIngrediente;

    public Topping(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente) {
        super(codigo, nome, medidaIngrediente, kcal);
        this.origemIngrediente = origemIngrediente;
    }
}
