package Ex_03_2_PizzariaPt2.Ingrediente_da_Pizza;

import Ex_03_1_Pizzaria.Enums.UnidadeMedida;
import Ex_03_2_PizzariaPt2.Enums.Origem;
import Ex_03_2_PizzariaPt2.Ingredientes;

public class Topping extends Ingredientes {

    private Origem origemIngrediente;

    public Topping(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente) {
        super(codigo, nome, medidaIngrediente, kcal);
        this.origemIngrediente = origemIngrediente;
    }
}
