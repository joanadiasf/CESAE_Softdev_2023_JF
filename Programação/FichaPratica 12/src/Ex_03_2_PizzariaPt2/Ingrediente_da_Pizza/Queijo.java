package Ex_03_2_PizzariaPt2.Ingrediente_da_Pizza;

import Ex_03_1_Pizzaria.Enums.UnidadeMedida;
import Ex_03_2_PizzariaPt2.Enums.Origem;
import Ex_03_2_PizzariaPt2.Enums.TipoQueijo;

public class Queijo extends Topping{

    private TipoQueijo tipo;

    public Queijo(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente, TipoQueijo tipo) {
        super(codigo, nome, medidaIngrediente, kcal, origemIngrediente);
        this.tipo = tipo;
    }
}
