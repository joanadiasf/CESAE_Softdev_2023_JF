package Ex_03_2_PizzariaPt2.Ingrediente_da_Pizza;

import Ex_03_1_Pizzaria.Enums.UnidadeMedida;
import Ex_03_2_PizzariaPt2.Enums.Origem;
import Ex_03_2_PizzariaPt2.Enums.TipoFrutosDoMar;

public class FrutoMar extends Topping{

    private TipoFrutosDoMar tipo;

    public FrutoMar(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente, TipoFrutosDoMar tipo) {
        super(codigo, nome, medidaIngrediente, kcal, origemIngrediente);
        this.tipo = tipo;
    }
}
