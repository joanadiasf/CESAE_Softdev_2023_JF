package PizzariaPt2.Ingrediente_da_Pizza;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Enums.Origem;
import PizzariaPt2.Enums.TipoFrutosDoMar;

public class FrutoMar extends Topping{

    private TipoFrutosDoMar tipo;

    public FrutoMar(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente, TipoFrutosDoMar tipo) {
        super(codigo, nome, medidaIngrediente, kcal, origemIngrediente);
        this.tipo = tipo;
    }
}
