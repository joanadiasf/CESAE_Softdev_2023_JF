package PizzariaPt2.Ingrediente_da_Pizza;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Enums.Origem;
import PizzariaPt2.Enums.TipoQueijo;

public class Queijo extends Topping{

    private TipoQueijo tipo;

    public Queijo(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente, TipoQueijo tipo) {
        super(codigo, nome, medidaIngrediente, kcal, origemIngrediente);
        this.tipo = tipo;
    }
}
