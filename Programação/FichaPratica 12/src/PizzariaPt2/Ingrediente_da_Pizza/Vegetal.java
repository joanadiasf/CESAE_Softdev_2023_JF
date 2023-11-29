package PizzariaPt2.Ingrediente_da_Pizza;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Enums.Origem;
import PizzariaPt2.Enums.TipoVegetal;

public class Vegetal extends Topping{

    private TipoVegetal tipo;

    public Vegetal(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente, TipoVegetal tipo) {
        super(codigo, nome, medidaIngrediente, kcal, origemIngrediente);
        this.tipo = tipo;
    }
}
