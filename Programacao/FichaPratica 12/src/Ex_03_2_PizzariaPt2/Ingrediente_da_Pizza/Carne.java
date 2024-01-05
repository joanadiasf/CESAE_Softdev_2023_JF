package Ex_03_2_PizzariaPt2.Ingrediente_da_Pizza;

import Ex_03_1_Pizzaria.Enums.UnidadeMedida;
import Ex_03_2_PizzariaPt2.Enums.Origem;
import Ex_03_2_PizzariaPt2.Enums.TipoCarne;

public class Carne extends Topping{

    private TipoCarne tipo;

    public Carne(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, Origem origemIngrediente, TipoCarne tipo) {
        super(codigo, nome, medidaIngrediente, kcal, origemIngrediente);
        this.tipo = tipo;
    }
}
